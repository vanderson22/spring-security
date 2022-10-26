package org.springframework.hateoas.examples;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.examples.security.JwtTokenUtil;
import org.springframework.hateoas.examples.security.model.JwtRequest;
import org.springframework.hateoas.examples.security.model.JwtResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtAuthenticationController {


	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;

	@RequestMapping(value = "/sign", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest)
			throws Exception {

		authenticate(authenticationRequest.getEmail(), authenticationRequest.getPassword());

		final UserDetails userDetails = jwtInMemoryUserDetailsService
				.loadUserByUsername(authenticationRequest.getEmail());
		final String token = jwtTokenUtil.generateToken(userDetails);
		System.out.println("Token" + token);
		System.out.println("Aut");
		return ResponseEntity.ok(new JwtResponse(token));
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity createUser(@RequestBody JwtRequest authenticationRequest)
			throws Exception {

		authenticate(authenticationRequest.getEmail(), authenticationRequest.getPassword());

		if(authenticationRequest.getEmail().contains("existe")) {
			throw new RuntimeException("Uusuário informado já existe");
		}
	 
		return ResponseEntity.ok().build();
	}
	

	private void authenticate(String username, String password) throws Exception {
		Objects.requireNonNull(username);
		Objects.requireNonNull(password);

		try {
			System.out.println("Aut");
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}

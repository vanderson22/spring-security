package org.springframework.hateoas.examples.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

@ControllerAdvice
public class ExceptionHandler extends ExceptionHandlerExceptionResolver {

	@org.springframework.web.bind.annotation.ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest webRequest) {

		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new Response(LocalDateTime.now(), HttpStatus.BAD_REQUEST, "usuário já cadastrado", "/create"));
	}

}

/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.hateoas.examples;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.hateoas.examples.model.InsuranceRange;
import org.springframework.hateoas.examples.model.Range;
import org.springframework.hateoas.examples.model.SalaryRange;
import org.springframework.hateoas.examples.model.SessionId;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Web {@link RestController} used to generate a REST API. Works by
 * injecting an {@link EmployeeRepository} and an
 * {@link EmployeeRepresentationModelAssembler} in the constructor, both of
 * which are used to retrieve data from the database, and assemble a REST
 * resource.
 *
 * @author Greg Turnquist
 */
@RestController
@CrossOrigin
class ParametricController {

	private List<Range> collect;

	public ParametricController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/parametric/v1/log")
	public SessionId getSessionId(@RequestHeader(name = "sessionId", required = false) SessionId b,
			@RequestHeader(name = "x-api-key", required = true) String apiKey, @RequestBody String payload) {

		System.out.println("api key : >>>>>> " + apiKey);
		System.out.println("SessionId : >>>>>> " + b);
		System.out.println();
		System.out.println(payload);

		return new SessionId(b == null ? UUID.randomUUID().toString() : b.getSessionId());
	}

	@PostMapping("/parametric/v1/quotation")
	public Quotation getQuotation(@RequestHeader(name = "sessionId", required = false) SessionId b,
			@RequestHeader(name = "x-api-key", required = true) String apiKey, @RequestBody Quotation payload) {

		System.out.println("api key : >>>>>> " + apiKey);
		System.out.println("SessionId : >>>>>> " + b);
		System.out.println();
		System.out.println(payload);

		Range[] r = new Range[] { new Range(100, 1001D, 100D, 160L, 1060D, 60D, 180L, 1060D, 40D),
				new Range(300, 1300D, 200D, 360L, 1020D, 120D, 380L, 1080D, 80D),
				new Range(400, 1400D, 200D, 460L, 1020D, 420D, 480L, 1040D, 80D) };

		Range x = new Range();
		for (int i = 0; i < r.length; i++) {
			if (r[i].getId().equals(payload.getRangeChosen())) {
				x = r[i];
			}

		}

		return new Quotation(1, payload.getName(), payload.getCpf(), payload.getEmail(), payload.getPhone(),
				payload.getLatitude(), payload.getLongitude(), LocalDateTime.now(), payload.getSalaryQuantity(),
				payload.getRangeChosen(), x.getInsurancePremium(), payload.getIs(), LocalDateTime.now(),
				LocalDateTime.now(), payload.toString());

	}

	@GetMapping("/parametric/v1/insurance-premium")
	public InsuranceRange getInsurancePremium(@RequestHeader(name = "sessionId", required = false) SessionId b,
			@RequestHeader(name = "x-api-key", required = true) String apiKey,
			@RequestParam(name = "localityId") String localityId,
			@RequestParam(name = "salaryQuantity") String qtdSalary,
			@RequestParam(name = "plantingDate") String plantingDate) {

		System.out.println(localityId + "  " + qtdSalary + "  " + plantingDate);

		return new InsuranceRange(localityId,
				new Range[] { new Range(121, 295.97D, 1212.00D, 160L, 1060D,  727.20D, 200L, 1060D, 484.80d),
						new Range(160, 327.96D, 1212D, 200L, 727.20D, 120D, 239L, 1080D, 484.80D),
						new Range(200, 379.59D, 1212D, 239L, 1020D, 727.20D, 278L, 1040D, 484.80D) });
	}

	@GetMapping("parametric/v1/salary-range")
	public SalaryRange getRange(@RequestHeader(name = "sessionId", required = false) SessionId b,
			@RequestHeader(name = "x-api-key", required = true) String apiKey,
			@RequestParam(name = "longitude") String longitude, @RequestParam(name = "latitude") String latitude,
			@RequestParam(name = "plantingDate") String plantingDate) {

		System.out.println(longitude + "  " + latitude + "  " + plantingDate);
		return new SalaryRange(-1 * new Random(33).nextInt(), 1, 2);
	}

}

package edu.aks.microservices.limitservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfiguration {

	@GetMapping("/limits")
	public LimitVo getLimits() {
		return new LimitVo(100, 10);
	}

}

package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsRestController {
	
	@Autowired
	public COnfigurationLimits conf;
	
	@GetMapping("/limits")
	public Limits retrievelimits() {
		
		return new Limits(conf.getMaximum(), conf.getMinimum());
		
	}
	
}

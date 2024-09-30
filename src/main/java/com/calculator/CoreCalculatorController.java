package com.calculator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreCalculatorController {

	@PostMapping("/calculator")
	public CoreModel calculate(@RequestBody String coreModel) {
		return parseCoreModel(coreModel);
	}

	public CoreModel parseCoreModel(String coreModelCode) {
		// null or empty core model code check can be introduced here.
		// for simplicity not adding right now
		if (coreModelCode == null || coreModelCode.isBlank()) {
			return new CoreModel();
		}

		if (coreModelCode.startsWith("EE") || coreModelCode.startsWith("EI")) {
			String[] dimensions = coreModelCode.substring(2).split("/");
			double width = Double.parseDouble(dimensions[0]);
			double height = Double.parseDouble(dimensions[1]);
			double depth = Double.parseDouble(dimensions[2]);
			return new CoreModel("EE", width, height, depth);
		}
		return null; // Invalid core model
	}

}

package com.example.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	private static final String template = "Result is %s";
	private Calculator calculator;

	@GetMapping("/calculate/{operation}/{num1}/{num2}")
	public String calculate(@PathVariable(name = "operation") String operation,
			@PathVariable(name = "num1") double num1, @PathVariable(name = "num2") double num2) {
		calculator = new Calculator(num1, num2);
		return String.format(template, calculator.calculate(operation));
	}

	@GetMapping("/calculate2")
	public String calculate2(@RequestParam(name = "operation", defaultValue = "add") String operation,
			@RequestParam(name = "num1", defaultValue = "0.0") double num1,
			@RequestParam(name = "num2", defaultValue = "0.0") double num2) {
		calculator = new Calculator(num1, num2);
		return String.format(template, calculator.calculate(operation));
	}
}

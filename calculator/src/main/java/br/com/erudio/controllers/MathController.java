package br.com.erudio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.services.MathService;

@RestController
public class MathController {

	@Autowired
	private MathService service;

	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return service.sum(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/subtraction/{numberOne}/{numberTwo}")
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return service.subtraction(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return service.multiplication(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return service.division(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/avg/{numberOne}/{numberTwo}")
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return service.average(numberOne, numberTwo);
	}
	
	@GetMapping(value = "/sqrt/{numberOne}")
	public Double squareRoot(@PathVariable("numberOne") String numberOne) {
		return service.squareRoot(numberOne);
	}
}

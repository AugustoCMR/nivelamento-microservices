package br.com.erudio.services;

import org.springframework.stereotype.Service;

import br.com.erudio.services.exception.UnsuportedMathOperationException;
import br.com.erudio.services.util.NumberConverter;

@Service
public class MathService {
	
	public Double sum(String numberOne, String numberTwo) {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return NumberConverter.covertToDouble(numberOne) + NumberConverter.covertToDouble(numberTwo);		
	}
	
	public Double subtraction(String numberOne, String numberTwo) {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return NumberConverter.covertToDouble(numberOne) - NumberConverter.covertToDouble(numberTwo);		
	}
	
	public Double multiplication(String numberOne, String numberTwo) {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return NumberConverter.covertToDouble(numberOne) * NumberConverter.covertToDouble(numberTwo);		
	}
	
	public Double division(String numberOne, String numberTwo) {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return NumberConverter.covertToDouble(numberOne) / NumberConverter.covertToDouble(numberTwo);		
	}
	
	public Double average(String numberOne, String numberTwo) {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return (NumberConverter.covertToDouble(numberOne) + NumberConverter.covertToDouble(numberTwo)) / 2;		
	}
	
	public Double squareRoot(String numberOne) {
		
		if (!NumberConverter.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return Math.sqrt(NumberConverter.covertToDouble(numberOne));	
	}
}

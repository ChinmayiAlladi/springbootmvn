package com.ust.service.factorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/fact")
public class Factorial {
	
	@GetMapping("/factorial/{id}")
	public int getFactByNum(@PathVariable int id) {
		int product = 1;
		int i = id;
		while(i >0) {
			product *= i;
			i--;
		}
		return product;
		
	}
}

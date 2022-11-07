package com.bishop.impresuibes;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Saludo {
@GetMapping("saludo")
public String saludar() {
	return "Hola mundo";
}
	
	
}

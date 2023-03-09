package com.opcserveraulaapi.teste;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {
	
	@GetMapping("/get")
	public String teste() {
		return "TIPO GET: TESTE GET"; 
	}
	
	@PostMapping("/post")
	public String postTeste() {
		return "TIPO POST: TEST POST";
	}
	
	@PutMapping("/put")
	public String putTeste(){
		return "TIPO PUT: TEST PUT ";
	}
	
	@DeleteMapping()
	public String deleteTeste() {
		return "TIPO Delete: TESTE DELETE";
	}
}

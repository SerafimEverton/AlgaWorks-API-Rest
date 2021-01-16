package com.everton.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everton.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar () {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("2546-9864");
		cliente1.setEmail("joao@algaworks.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Jonatan");
		cliente2.setTelefone("2577-9994");
		cliente2.setEmail("jonatan@algaworks.com");
		
		return Arrays.asList(cliente1, cliente2);
		
	}

}

package com.calcme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calcme.model.Usuario;
import com.calcme.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@PostMapping("/addUser")
	public String saveUser(@RequestBody Usuario usuario) { 
		repository.save(usuario);
		return "Usuário adicionado com o ID: " + usuario.getId();
	}
	
}

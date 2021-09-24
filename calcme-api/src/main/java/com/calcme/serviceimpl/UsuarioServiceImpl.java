package com.calcme.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calcme.model.Usuario;
import com.calcme.repository.UsuarioRepository;
import com.calcme.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario criar(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}
}

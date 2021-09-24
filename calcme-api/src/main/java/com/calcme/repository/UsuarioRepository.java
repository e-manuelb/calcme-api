package com.calcme.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.calcme.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

}

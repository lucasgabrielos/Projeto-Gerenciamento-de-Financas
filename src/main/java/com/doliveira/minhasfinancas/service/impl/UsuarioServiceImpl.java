package com.doliveira.minhasfinancas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doliveira.minhasfinancas.exception.RegraNegocioExcepetion;
import com.doliveira.minhasfinancas.model.entity.Usuario;
import com.doliveira.minhasfinancas.model.repository.UsuarioRepository;
import com.doliveira.minhasfinancas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository repository;
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		
		boolean existe= repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioExcepetion("Já existe um usuário cadastrado com este email.");
		}

	}

}

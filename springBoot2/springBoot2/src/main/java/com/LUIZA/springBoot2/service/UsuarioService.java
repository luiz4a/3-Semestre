package com.LUIZA.springBoot2.service;

import com.LUIZA.springBoot2.model.Usuario;
import com.LUIZA.springBoot2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return UsuarioRepository.save(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        return UsuarioRepository.findByEmail(email);
    }

    public Usuario buscarUsuarioPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarUsuarioPorId(Long id) {
        UsuarioRepository.deleteById(id);
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }
}


package com.Springboot.luizacomp.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import com.Springboot.luizacomp.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    }


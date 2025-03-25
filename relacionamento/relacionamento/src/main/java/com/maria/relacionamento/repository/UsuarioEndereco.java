package com.maria.relacionamento.repository;

import com.maria.relacionamento.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioEndereco  extends JpaRepository<Usuario, Long> {

}

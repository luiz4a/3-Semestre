package com.luiza.atividade1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiza.atividade1.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Optional<Funcionario> findByEmail(String email);

    
    // Aqui você pode adicionar métodos personalizados, se necessário
    // Exemplo: List<Funcionario> findByNome(String nome);

}

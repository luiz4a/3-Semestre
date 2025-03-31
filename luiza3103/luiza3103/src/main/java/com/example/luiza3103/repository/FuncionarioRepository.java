package com.example.luiza3103.repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.luiza3103.model.Funcionario;

@Repository
    public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
       Funcionario findbyEmail(String email);

    void salvarFuncionario(Funcionario funcionario);

}


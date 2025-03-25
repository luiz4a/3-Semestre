package com.revoada.rev.controller;

import com.revoada.rev.model.Funcionario;
import com.revoada.rev.repository.FuncionarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/funcionario")
public class FuncionarioController {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public Funcionario salvar(@RequestBody Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return funcionarioRepository.save(funcionario);
    }

    @PutMapping
    public Funcionario atualizar(@RequestBody Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return funcionarioRepository.save(funcionario);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        funcionarioRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

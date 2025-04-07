package com.luiza.atividade1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiza.atividade1.model.Funcionario;
import com.luiza.atividade1.service.FuncionarioService;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RequestMapping ("/tab_funcionario")
@RestController
public class FuncionarioController {
    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario> listarTodos() {
        return funcionarioService.listarTodos();
    }

    @PostMapping("path")
    public ResponseEntity<Map<String, String>> salvar (@Valid @RequestBody Funcionario funcionario){
        funcionarioService.salvar(funcionario);
        return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(Map.of("Mensagem", "Funcionário cadastrado com sucesso!"));
    }

    @PutMapping
    public ResponseEntity<Map<String, String>> atualizar(@Valid @RequestBody Funcionario funcionario) {
        funcionarioService.atualizar(funcionario);
        return ResponseEntity
        .status(HttpStatus.OK)
        .body(Map.of("Mensagem", "Funcionário atualizado com sucesso!"));
   }

   @DeleteMapping
   public ResponseEntity<Map<String, String>> excluir(@RequestParam Long id) {
        funcionarioService.excluir(id);
        return ResponseEntity
        .status(HttpStatus.OK)
        .body(Map.of("Mensagem", "Funcionário excluído com sucesso!"));
    }
    
    

}

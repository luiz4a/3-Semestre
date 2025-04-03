package com.Springboot.luizacomp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.luizacomp.model.Usuario;
import com.Springboot.luizacomp.service.UsuarioService;

import jakarta.validation.Valid;

@RequestMapping ("/usuarios")
@RestController


public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }
    

    @PostMapping ("/salvar")
    public ResponseEntity<Map<String, String>> salvar(@Valid @RequestBody Usuario usuario) {
        usuarioService.salvar(usuario);
        return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(Map.of("Mensagem", "usuario salvo com sucesso!"));

    }
    @PutMapping
    public ResponseEntity<Map<String, String>> atualizar(@PathVariable long id, @Valid @RequestBody Usuario usuario) {
        usuarioService.atualizar(usuario);
        return ResponseEntity.ok()
        .body(Map.of("Mensagem!", "usuario atualizado com sucesso!"));

    }

    @DeleteMapping 
    public ResponseEntity<Map<String, String>> excluir(@PathVariable Long id) {
        usuarioService.excluir(id);
        return ResponseEntity
        .ok()
        .body(Map.of("Mensagem", "usuario excluido com sucesso!"));
    }



    




}

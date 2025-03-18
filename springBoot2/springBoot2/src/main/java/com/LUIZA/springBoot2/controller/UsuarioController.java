package com.LUIZA.springBoot2.controller;

import com.LUIZA.springBoot2.service.UsuarioService;
import com.LUIZA.springBoot2.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

   @PostMapping("/salvar")
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario) {
        UsuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email) {
        Usuario usuario = UsuarioService.buscarUsuarioPorEmail(email);
        return ResponseEntity.ok(usuario);

    }

    @PostMapping ("/atualizar")
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario) {
        usuarioService.atualizarUsuario(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping ("/deletar/{id}")
    public ResponseEntity<Void> deletarUsuarioPorId(@PathVariable Long id) {
        UsuarioService.deletarUsuarioPorId(id);
        return ResponseEntity.noContent().build();
    }




}

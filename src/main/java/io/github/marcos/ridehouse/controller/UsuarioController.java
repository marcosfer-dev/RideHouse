package io.github.marcos.ridehouse.controller;

import io.github.marcos.ridehouse.dto.UsuarioRequest;
import io.github.marcos.ridehouse.model.Usuario;
import io.github.marcos.ridehouse.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody @Valid UsuarioRequest usuarioRequest) {
        return usuarioService.addUsuario(usuarioRequest);
    }
}
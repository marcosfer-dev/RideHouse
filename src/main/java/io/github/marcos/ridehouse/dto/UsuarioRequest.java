package io.github.marcos.ridehouse.dto;

import io.github.marcos.ridehouse.model.Genero;

import java.time.LocalDate;

public record UsuarioRequest(
        String nomeCompleto,
        String email,
        String cpf,
        LocalDate dataNascimento,
        String telefone,
        Genero genero,
        String senha,
        boolean aceitouTermos
    ) {
}

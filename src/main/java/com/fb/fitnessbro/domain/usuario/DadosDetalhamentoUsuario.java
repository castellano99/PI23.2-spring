package com.fb.fitnessbro.domain.usuario;

import com.fb.fitnessbro.domain.endereco.DadosEndereco;
import com.fb.fitnessbro.domain.endereco.Endereco;

public record DadosDetalhamentoUsuario(Long id, String nome, String email, Endereco endereco) {
    public DadosDetalhamentoUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getEndereco());
    }
}

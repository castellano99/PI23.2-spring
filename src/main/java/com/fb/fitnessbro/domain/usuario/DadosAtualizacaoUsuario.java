package com.fb.fitnessbro.domain.usuario;

import com.fb.fitnessbro.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
        @NotNull
        Long id,
        String nome,
        String email,
        DadosEndereco endereco){
}

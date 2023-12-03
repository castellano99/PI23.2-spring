package com.fb.fitnessbro.domain.usuario;

import com.fb.fitnessbro.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(@NotBlank
                                   String nome,
                                   @NotBlank
                                   String email,
                                   @NotNull @Valid
                                   DadosEndereco endereco) {
}

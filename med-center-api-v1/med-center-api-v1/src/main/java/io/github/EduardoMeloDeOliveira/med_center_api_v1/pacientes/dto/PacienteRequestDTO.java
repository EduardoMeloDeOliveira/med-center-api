package io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record PacienteRequestDTO(

        @NotBlank
        String nome,

        @Email
        @NotBlank
        String email,

        @Size(min = 6)
        String senha,

        @NotBlank
        @Size(min = 11, max = 11)
        String cpf,

        @NotBlank
        @Size(min = 12, max = 12)
        String telefone,

        @NotBlank
        @Size(min = 8, max = 8)
        String cep
) {
}

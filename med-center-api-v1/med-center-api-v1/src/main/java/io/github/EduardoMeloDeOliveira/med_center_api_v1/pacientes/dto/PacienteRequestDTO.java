package io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record PacienteRequestDTO(

        @NotBlank(message = "Nome do paciente é obrigatório")
        String nome,

        @Email(message = "Deve ser um email")
        @NotBlank(message = "Email do paciente é obrigatório")
        String email,

        @Size(min = 6)
        @NotBlank(message = "Senha do paciente é obrigatória")
        String senha,

        @NotBlank(message = "O Cpf é obrigatório")
        @Size(min = 11, max = 11, message = "Cpf deve conter 11 caracteres")
        String cpf,

        @NotBlank(message = "Telefone é obrigatório")
        @Size(min = 11, max = 11, message = "Telefone deve conter 11 caracteres")
        String telefone,

        @NotBlank(message = "Cep é obrigatório")
        @Size(min = 8, max = 8, message = "Cep deve conter 8 caracteres")
        String cep
) {
}

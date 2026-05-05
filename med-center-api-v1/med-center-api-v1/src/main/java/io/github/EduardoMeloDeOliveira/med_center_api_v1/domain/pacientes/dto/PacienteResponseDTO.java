package io.github.EduardoMeloDeOliveira.med_center_api_v1.domain.pacientes.dto;

public record PacienteResponseDTO(

        Long pacienteId,
        String nome,
        String email,
        String cpf,
        String telefone
) {
}

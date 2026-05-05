package io.github.EduardoMeloDeOliveira.med_center_api_v1.domain.pacientes.dto;

import io.github.EduardoMeloDeOliveira.med_center_api_v1.domain.pacientes.entity.Paciente;

public record PacienteResponseDTO(

        Long pacienteId,
        String nome,
        String email,
        String cpf,
        String telefone
) {

    public PacienteResponseDTO(Paciente paciente){
        this(paciente.getPacienteId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone());
    }
}

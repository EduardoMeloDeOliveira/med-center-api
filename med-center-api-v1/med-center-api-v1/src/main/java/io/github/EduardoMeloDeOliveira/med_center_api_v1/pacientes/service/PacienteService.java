package io.github.EduardoMeloDeOliveira.med_center_api_v1.domain.pacientes.service;

import io.github.EduardoMeloDeOliveira.med_center_api_v1.domain.pacientes.dto.PacienteRequestDTO;
import io.github.EduardoMeloDeOliveira.med_center_api_v1.domain.pacientes.dto.PacienteResponseDTO;
import io.github.EduardoMeloDeOliveira.med_center_api_v1.domain.pacientes.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository pacienteRepository;


    public PacienteResponseDTO createPaciente(PacienteRequestDTO requestDTO){
        boolean existsPacienteByEmail = existsByEmail(requestDTO.email());
        boolean existsPacienteByCpf = existsByCpf(requestDTO.cpf());

        if(existsPacienteByEmail || existsPacienteByCpf){
            throw new MedCenterNotFoundException("Paciente com email ou cpf já cadastrado");
        }
    }





    private boolean existsByEmail(String email){
        return pacienteRepository.existsByEmail(email);
    }

    private boolean existsByCpf(String cpf){
        return pacienteRepository.existsByCpf(cpf);
    }
}

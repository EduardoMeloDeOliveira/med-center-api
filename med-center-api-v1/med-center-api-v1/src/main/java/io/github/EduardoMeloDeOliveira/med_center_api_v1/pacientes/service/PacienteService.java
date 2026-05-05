package io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.service;

import io.github.EduardoMeloDeOliveira.med_center_api_v1.handlers.exceptions.MedCenterNotFoundException;
import io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.dto.PacienteRequestDTO;
import io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.dto.PacienteResponseDTO;
import io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.entity.Paciente;
import io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository pacienteRepository;


    public PacienteResponseDTO createPaciente(PacienteRequestDTO requestDTO){

        if(existsByEmail(requestDTO.email()) || existsByCpf(requestDTO.cpf())){
            throw new MedCenterNotFoundException("Paciente com email ou cpf já cadastrado");
        }

        return new PacienteResponseDTO(pacienteRepository.save(new Paciente(requestDTO)));
    }





    private boolean existsByEmail(String email){
        return pacienteRepository.existsByEmail(email);
    }

    private boolean existsByCpf(String cpf){
        return pacienteRepository.existsByCpf(cpf);
    }
}

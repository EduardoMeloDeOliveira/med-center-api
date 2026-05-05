package io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.controller;

import io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.dto.PacienteRequestDTO;
import io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.dto.PacienteResponseDTO;
import io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.service.PacienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/med-center-api/v1/pacientes")
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService pacienteService;


    @PostMapping
    public ResponseEntity<PacienteResponseDTO> createPaciente(@RequestBody @Valid PacienteRequestDTO requestDTO) {

        return ResponseEntity.ok(pacienteService.createPaciente(requestDTO));

    }
}

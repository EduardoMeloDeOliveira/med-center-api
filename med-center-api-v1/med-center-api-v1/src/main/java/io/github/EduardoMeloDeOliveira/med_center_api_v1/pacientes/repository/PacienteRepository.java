package io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.repository;

import io.github.EduardoMeloDeOliveira.med_center_api_v1.pacientes.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {

    Boolean existsByEmail(String email);
    Boolean existsByCpf(String cpf);
}

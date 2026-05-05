package io.github.EduardoMeloDeOliveira.med_center_api_v1.domain.pacientes.entity;

import io.github.EduardoMeloDeOliveira.med_center_api_v1.domain.pacientes.dto.PacienteRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_pacientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pacienteId;

    private String nome;

    @Column(unique = true)
    private String email;

    private String senha;

    @Column(unique = true)
    private String cpf;

    private String telefone;

    public Paciente (PacienteRequestDTO requestDTO){
        this.nome = requestDTO.nome();
        this.email = requestDTO.email();
        this.senha = requestDTO.senha();
        this.cpf = requestDTO.cpf();
        this.telefone = requestDTO.telefone();
    }

}

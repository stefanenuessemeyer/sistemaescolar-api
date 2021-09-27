package com.sistemaescolar.api.entity;

import com.sistemaescolar.api.entity.util.EstadoCivil;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Professor {

    private Long id;
    private String nome;
    private Graduacao graduacao;
    private String email;
    private String telefone;
    private String cpf;
    private EstadoCivil estadoCivil;

}

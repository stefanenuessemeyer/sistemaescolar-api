package com.sistemaescolar.api.entity;

import com.sistemaescolar.api.entity.util.EstadoCivil;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Responsavel {

    private Long id;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String cpf;
    private EstadoCivil estadoCivil;
    private String email;

}

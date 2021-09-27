package com.sistemaescolar.api.entity;

import org.springframework.core.SpringVersion;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class EscolaUnica {

    private Long id;
    private Escola escola;
    private Professor professor;
    private Aluno aluno;

}

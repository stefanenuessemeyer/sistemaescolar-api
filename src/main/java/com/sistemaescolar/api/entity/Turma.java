package com.sistemaescolar.api.entity;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Turma {

    private Long id;
    private String nomeTurma;
    private String turno;
    private String nomeAluno;
    private Materia materia;


}

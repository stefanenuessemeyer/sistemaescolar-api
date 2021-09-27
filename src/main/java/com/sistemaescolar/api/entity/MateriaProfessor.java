package com.sistemaescolar.api.entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class MateriaProfessor {

    private Long id;
    private Professor professor;
    private Materia materia;


}

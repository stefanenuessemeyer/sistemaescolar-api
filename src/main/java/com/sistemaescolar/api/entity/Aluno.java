package com.sistemaescolar.api.entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Aluno {

    private Long id;
    private String nome;
    private EscolaUnica escolaUnica;
    private Responsavel resposavel;
    private String cpf;
    private String telefone;
    private Turma turma;
    private String email;
    private FixaMedica fixaMedica;
    private String sexo;
    private Endereco endereco;


}

package com.sistemaescolar.api.entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Escola {

    private Long id;
    private String nome;
    private Endereco endereco;
    private String cidade;
    private String telefone;
    private String cnpj;


}

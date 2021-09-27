package com.sistemaescolar.api.entity;

import java.time.LocalDateTime;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Chamada {

    private Long id;
    private LocalDateTime dataAula;
    private Turma turma;



    @Override
    public String toString() {
        return "Chamada{" +
                "id=" + id +
                ", dataAula=" + dataAula +
                ", turma=" + turma +
                '}';
    }
}

package com.sistemaescolar.api.entity;

import com.sistemaescolar.api.entity.util.TipoSanguineo;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class FixaMedica {

    private Long id;
    private TipoSanguineo tipoSanguineo;
    private Deficiencia deficiencia;
    private Double peso;
    private Double altura;
    private String planoDeSaude;

}

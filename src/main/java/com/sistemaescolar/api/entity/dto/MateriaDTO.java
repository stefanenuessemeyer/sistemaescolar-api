package com.sistemaescolar.api.entity.dto;

import com.sistemaescolar.api.entity.Materia;

import java.util.List;
import java.util.stream.Collectors;

public class MateriaDTO {

    private String nomeDaMateria;

    public String getNomeDaMateria() {
        return nomeDaMateria;
    }

   public MateriaDTO(Materia materia){
        this.nomeDaMateria = materia.getNomeDaMateria();
   }

    public static List<MateriaDTO> converter(List<Materia> materias) {
        return materias.stream().map(MateriaDTO::new).collect(Collectors.toList());
    }
}

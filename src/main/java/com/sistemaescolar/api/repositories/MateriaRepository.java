package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.Chamada;
import com.sistemaescolar.api.entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
}

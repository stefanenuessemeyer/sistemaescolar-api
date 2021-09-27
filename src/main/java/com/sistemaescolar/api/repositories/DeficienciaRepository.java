package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.Deficiencia;
import com.sistemaescolar.api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeficienciaRepository extends JpaRepository<Deficiencia, Long> {
}

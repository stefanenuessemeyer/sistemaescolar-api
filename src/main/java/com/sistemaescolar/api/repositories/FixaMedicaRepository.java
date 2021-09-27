package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.FixaMedica;
import com.sistemaescolar.api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixaMedicaRepository extends JpaRepository<FixaMedica, Long> {
}

package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.Chamada;
import com.sistemaescolar.api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
}

package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.Escola;
import com.sistemaescolar.api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaRepository extends JpaRepository<Escola, Long> {
}

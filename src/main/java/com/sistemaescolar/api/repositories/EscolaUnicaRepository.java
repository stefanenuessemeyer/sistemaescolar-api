package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.EscolaUnica;
import com.sistemaescolar.api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaUnicaRepository extends JpaRepository<EscolaUnica, Long> {
}

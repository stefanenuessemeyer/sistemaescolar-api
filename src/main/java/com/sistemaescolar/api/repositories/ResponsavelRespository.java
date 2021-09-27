package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.Responsavel;
import com.sistemaescolar.api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsavelRespository extends JpaRepository<Responsavel, Long> {
}

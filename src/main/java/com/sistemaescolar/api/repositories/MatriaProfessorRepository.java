package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.MateriaProfessor;
import com.sistemaescolar.api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriaProfessorRepository extends JpaRepository<MateriaProfessor, Long> {
}

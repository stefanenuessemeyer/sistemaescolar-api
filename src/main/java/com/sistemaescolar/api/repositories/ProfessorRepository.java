package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.Professor;
import com.sistemaescolar.api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

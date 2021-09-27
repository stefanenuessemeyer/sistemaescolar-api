package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.Aluno;
import com.sistemaescolar.api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

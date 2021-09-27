package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.Chamada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadaRepository extends JpaRepository<Chamada, Long> {
}

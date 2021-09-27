package com.sistemaescolar.api.repositories;

import com.sistemaescolar.api.entity.EscolaUnica;
import com.sistemaescolar.api.entity.Graduacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GraduacaoRepository extends JpaRepository<Graduacao, Long> {
}

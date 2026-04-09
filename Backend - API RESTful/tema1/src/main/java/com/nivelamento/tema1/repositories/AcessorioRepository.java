package com.nivelamento.tema1.repositories;

import com.nivelamento.tema1.models.AcessorioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessorioRepository extends JpaRepository<AcessorioModel, Long> {
}

package com.nivelamento.tema1.repositories;

import com.nivelamento.tema1.models.VeiculoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<VeiculoModel, Long> {
}

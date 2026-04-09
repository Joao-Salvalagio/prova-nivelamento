package com.nivelamento.tema1.services;

import com.nivelamento.tema1.models.VeiculoModel;
import com.nivelamento.tema1.repositories.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    public VeiculoModel save(VeiculoModel veiculoModel){
        return veiculoRepository.save(veiculoModel);
    }

    public List<VeiculoModel> findAll(){
        return veiculoRepository.findAll();
    }

    public VeiculoModel update(VeiculoModel veiculoModel){
        return veiculoRepository.save(veiculoModel);
    }

    public void deleteById(Long id){
        veiculoRepository.deleteById(id);
    }
}
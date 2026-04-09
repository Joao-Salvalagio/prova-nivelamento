package com.nivelamento.tema1.services;

import com.nivelamento.tema1.models.AcessorioModel;
import com.nivelamento.tema1.repositories.AcessorioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AcessorioService {
    private final AcessorioRepository acessorioRepository;

    public AcessorioModel save(AcessorioModel acessorioModel){
        return acessorioRepository.save(acessorioModel);
    }

    public List<AcessorioModel> findAll(){
        return acessorioRepository.findAll();
    }

    public AcessorioModel update(AcessorioModel acessorioModel){
        return acessorioRepository.save(acessorioModel);
    }

    public void deleteById(Long id){
        acessorioRepository.deleteById(id);
    }
}

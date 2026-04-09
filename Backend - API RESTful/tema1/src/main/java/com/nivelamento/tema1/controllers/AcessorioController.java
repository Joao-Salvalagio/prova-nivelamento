package com.nivelamento.tema1.controllers;

import com.nivelamento.tema1.models.AcessorioModel;
import com.nivelamento.tema1.services.AcessorioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/acessorio")
@CrossOrigin("*")
public class AcessorioController {
    private final AcessorioService acessorioService;

    @PostMapping
    public AcessorioModel save(@RequestBody AcessorioModel acessorioModel){
        return acessorioService.save(acessorioModel);
    }

    @GetMapping
    public List<AcessorioModel> findAll(){
        return acessorioService.findAll();
    }

    @PutMapping
    public AcessorioModel update(AcessorioModel acessorioModel){
        return acessorioService.update(acessorioModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        acessorioService.deleteById(id);
    }
}

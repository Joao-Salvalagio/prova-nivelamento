package com.nivelamento.tema1.controllers;

import com.nivelamento.tema1.models.VeiculoModel;
import com.nivelamento.tema1.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/veiculo")
@CrossOrigin("*")
public class VeiculoController {
    private final VeiculoService veiculoService;

    @PostMapping
    public VeiculoModel save(@RequestBody VeiculoModel veiculo){
        return veiculoService.save(veiculo);
    }

    @GetMapping
    public List<VeiculoModel> findAll(){
        return veiculoService.findAll();
    }

    @PutMapping
    public VeiculoModel update(@RequestBody VeiculoModel veiculo){
        return veiculoService.update(veiculo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        veiculoService.deleteById(id);
    }
}
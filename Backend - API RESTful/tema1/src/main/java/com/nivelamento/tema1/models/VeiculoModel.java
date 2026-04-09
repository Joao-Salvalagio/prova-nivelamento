package com.nivelamento.tema1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_veiculo")
public class VeiculoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private Integer anoFabricacao;
    private String placa;

    @OneToMany(mappedBy = "veiculo")
    private List<AcessorioModel> acessorios;

    public void addAcessorio(AcessorioModel item) {
        this.acessorios.add(item);
        item.setVeiculo(this);
    }
    public void removeAcessorio(AcessorioModel item) {
        this.acessorios.remove(item);
        item.setVeiculo(null);
    }
}
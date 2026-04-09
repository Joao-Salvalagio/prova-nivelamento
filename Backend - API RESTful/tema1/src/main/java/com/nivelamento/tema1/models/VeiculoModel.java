package com.nivelamento.tema1.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_veiculo")
public class VeiculoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String modelo;
    @NotNull
    private Integer anoFabricacao;
    @NotNull
    private String placa;

    @ManyToOne
    @JoinColumn(name = "id_acessorio")
    private AcessorioModel item;
}
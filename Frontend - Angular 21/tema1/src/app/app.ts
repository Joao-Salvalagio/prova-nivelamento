import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { VeiculoService } from './services/veiculo.service';
import { AcessorioService } from './services/acessorio.service';
import { Veiculo } from './models/veiculo.model';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './app.html',
})
export class App implements OnInit {
  veiculos: Veiculo[] = [];
  veiculo: Veiculo = { modelo: '', anoFabricacao: null as any, placa: '' };
  acessorio: any = { id: null, nome: '', idVeiculo: null };

  constructor(
    private vService: VeiculoService,
    private aService: AcessorioService,
  ) {}

  ngOnInit() {
    this.findAll();
  }

  findAll() {
    this.vService.findAll().subscribe((res) => (this.veiculos = res));
  }

  saveVeiculo() {
    if (this.veiculo.id) {
      this.vService.update(this.veiculo).subscribe(() => {
        this.findAll();
        this.veiculo = { modelo: '', anoFabricacao: null as any, placa: '' };
      });
    } else {
      this.vService.save(this.veiculo).subscribe(() => {
        this.findAll();
        this.veiculo = { modelo: '', anoFabricacao: null as any, placa: '' };
      });
    }
  }

  updateVeiculo(v: Veiculo) {
    this.veiculo = { ...v };
  }

  deleteByIdVeiculo(id: number) {
    this.vService.deleteById(id).subscribe(() => this.findAll());
  }

  saveAcessorio() {
    const obj = {
      id: this.acessorio.id,
      nome: this.acessorio.nome,
      veiculo: { id: this.acessorio.idVeiculo },
    };

    if (this.acessorio.id) {
      this.aService.update(obj).subscribe(() => {
        this.findAll();
        this.acessorio = { id: null, nome: '', idVeiculo: null };
      });
    } else {
      this.aService.save(obj).subscribe(() => {
        this.findAll();
        this.acessorio = { id: null, nome: '', idVeiculo: null };
      });
    }
  }

  updateAcessorio(a: any, idVeiculo: number) {
    this.acessorio = { id: a.id, nome: a.nome, idVeiculo: idVeiculo };
  }

  deleteByIdAcessorio(id: number) {
    this.aService.deleteById(id).subscribe(() => this.findAll());
  }
}

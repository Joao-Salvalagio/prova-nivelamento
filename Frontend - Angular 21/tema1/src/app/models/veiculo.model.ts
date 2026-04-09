export interface Acessorio {
  id?: number;
  nome: string;
  veiculo?: { id?: number };
}

export interface Veiculo {
  id?: number;
  modelo: string;
  anoFabricacao: number;
  placa: string;
  acessorios?: Acessorio[];
}

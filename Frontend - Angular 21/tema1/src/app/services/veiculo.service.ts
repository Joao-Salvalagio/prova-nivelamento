import { inject, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Veiculo } from '../models/veiculo.model';

@Injectable({
  providedIn: 'root',
})
export class VeiculoService {
  private apiUrl = 'http://localhost:8080/api/veiculo';
  private http = inject(HttpClient);

  findAll(): Observable<Veiculo[]> {
    return this.http.get<Veiculo[]>(this.apiUrl);
  }

  save(veiculo: Veiculo): Observable<Veiculo> {
    return this.http.post<Veiculo>(this.apiUrl, veiculo);
  }

  update(veiculo: Veiculo): Observable<Veiculo> {
    return this.http.put<Veiculo>(this.apiUrl, veiculo);
  }

  deleteById(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}

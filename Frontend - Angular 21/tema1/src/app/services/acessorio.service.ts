import { inject, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Acessorio } from '../models/veiculo.model';

@Injectable({
  providedIn: 'root',
})
export class AcessorioService {
  apiUrl = 'http://localhost:8080/api/acessorio';
  private http = inject(HttpClient);

  save(acessorio: Acessorio): Observable<Acessorio> {
    return this.http.post<Acessorio>(this.apiUrl, acessorio);
  }

  update(acessorio: Acessorio): Observable<Acessorio> {
    return this.http.put<Acessorio>(this.apiUrl, acessorio);
  }

  deleteById(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}

import { TestBed } from '@angular/core/testing';

import { Acessorio } from './acessorio';

describe('Acessorio', () => {
  let service: Acessorio;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Acessorio);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

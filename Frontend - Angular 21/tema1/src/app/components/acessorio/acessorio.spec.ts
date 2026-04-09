import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Acessorio } from './acessorio';

describe('Acessorio', () => {
  let component: Acessorio;
  let fixture: ComponentFixture<Acessorio>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Acessorio],
    }).compileComponents();

    fixture = TestBed.createComponent(Acessorio);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

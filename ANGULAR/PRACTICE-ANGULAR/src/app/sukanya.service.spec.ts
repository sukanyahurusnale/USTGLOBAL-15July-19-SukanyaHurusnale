import { TestBed } from '@angular/core/testing';

import { SukanyaService } from './sukanya.service';

describe('SukanyaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SukanyaService = TestBed.get(SukanyaService);
    expect(service).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CatChildComponent } from './cat-child.component';

describe('CatChildComponent', () => {
  let component: CatChildComponent;
  let fixture: ComponentFixture<CatChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CatChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CatChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

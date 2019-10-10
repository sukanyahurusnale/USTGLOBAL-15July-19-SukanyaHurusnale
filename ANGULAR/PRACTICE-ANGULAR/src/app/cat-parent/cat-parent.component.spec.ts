import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CatParentComponent } from './cat-parent.component';

describe('CatParentComponent', () => {
  let component: CatParentComponent;
  let fixture: ComponentFixture<CatParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CatParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CatParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DatabinidingComponent } from './databiniding.component';

describe('DatabinidingComponent', () => {
  let component: DatabinidingComponent;
  let fixture: ComponentFixture<DatabinidingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [DatabinidingComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DatabinidingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

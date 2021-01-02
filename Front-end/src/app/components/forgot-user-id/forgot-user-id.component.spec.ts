import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ForgotUserIDComponent } from './forgot-user-id.component';

describe('ForgotUserIDComponent', () => {
  let component: ForgotUserIDComponent;
  let fixture: ComponentFixture<ForgotUserIDComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ForgotUserIDComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ForgotUserIDComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SetNewPswComponent } from './set-new-psw.component';

describe('SetNewPswComponent', () => {
  let component: SetNewPswComponent;
  let fixture: ComponentFixture<SetNewPswComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SetNewPswComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SetNewPswComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

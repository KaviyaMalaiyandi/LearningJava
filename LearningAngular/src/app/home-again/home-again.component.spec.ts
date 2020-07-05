import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeAgainComponent } from './home-again.component';

describe('HomeAgainComponent', () => {
  let component: HomeAgainComponent;
  let fixture: ComponentFixture<HomeAgainComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeAgainComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeAgainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PastcartComponent } from './pastcart.component';

describe('PastcartComponent', () => {
  let component: PastcartComponent;
  let fixture: ComponentFixture<PastcartComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PastcartComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PastcartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

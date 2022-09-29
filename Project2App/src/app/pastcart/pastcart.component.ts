import { Component, Input, OnInit } from '@angular/core';
import { Person } from '../interfaces';
import { PersonService } from '../services/person.service';
import { Cart } from '../interfaces';
import { Product } from '../interfaces';
import { CookieService } from 'ngx-cookie';


@Component({
  selector: 'app-pastcart',
  templateUrl: './pastcart.component.html',
  styleUrls: ['./pastcart.component.css']
})
export class PastcartComponent implements OnInit {
  // <app-past-cart-component [cart] = 'object' />
  @Input()
  cart!: Cart;

  constructor() { }

  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PersonService } from '../services/person.service';
import { SessionService } from '../services/session.service';
import { CookieService } from 'ngx-cookie';
import { Person, Product, ProductCart } from '../interfaces';
import { Cart } from '../interfaces';

@Component({
  selector: 'app-current-cart',
  templateUrl: './current-cart.component.html',
  styleUrls: ['./current-cart.component.css']
})
export class CurrentCartComponent implements OnInit {

  current!:Cart;
  person!:Person;
  productcart!:ProductCart;
  userId!: Number;

  constructor(private personService: PersonService,
    private sessionService:SessionService,
    private router: Router,
    private cookieService: CookieService) { }

  ngOnInit(): void {
    console.log(this.current);
    let userId = Number(this.cookieService.get("userId"));
    this.getById(userId);
  }

  getById(x:Number){
    this.personService.getById(x).subscribe(
      returnedPerson => {
        this.current! = returnedPerson.current!;
      }
      )
    
  }


}

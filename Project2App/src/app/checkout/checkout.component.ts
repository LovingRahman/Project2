import { Component, OnInit } from '@angular/core';
import { Person } from '../interfaces';
import { PersonService } from '../services/person.service';
import { Cart } from '../interfaces';
import { Product } from '../interfaces';
import { CookieService } from 'ngx-cookie';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

  constructor(private personService:PersonService, private cookieService: CookieService) { }
  
  personId!: Number;

  ngOnInit(): void {
    this.personId = Number(this.cookieService.get("userId"));
    this.checkout();
  }

  checkout(){
    console.log("You're checking out");
    this.personService.checkout(this.personId).subscribe(
      
    );
  }

}

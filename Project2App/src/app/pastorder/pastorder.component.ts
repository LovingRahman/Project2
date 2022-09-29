import { Component, OnInit } from '@angular/core';
import { Person } from '../interfaces';
import { PersonService } from '../services/person.service';
import { Cart } from '../interfaces';
import { Product } from '../interfaces';
import { CookieService } from 'ngx-cookie';

@Component({
  selector: 'app-pastorder',
  templateUrl: './pastorder.component.html',
  styleUrls: ['./pastorder.component.css']
})
export class PastorderComponent implements OnInit {
  pastOrder!:Person;
  previous!:Cart[];
  personId!: Number;

  constructor(private personServices: PersonService, private cookieService: CookieService) { }

  ngOnInit(): void {
    this.personId = Number(this.cookieService.get("userId"));
    this.getPastOrder();
    this.previous = this.pastOrder.previous!;

  }

  getPastOrder(){
    this.personServices.getPastOrder(this.personId).subscribe(
      returnedPerson => {
        this.pastOrder = returnedPerson;
      }
    )
  }


}

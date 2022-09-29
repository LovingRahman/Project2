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
  person!:Person;
  personId!: Number;
  previous!: Cart[];

  constructor(private personServices: PersonService, private cookieService: CookieService) { }

  ngOnInit(): void {
    let personId = Number(this.cookieService.get("userId"));
    this.getPastOrder(personId);
  }

  getPastOrder(x:Number){
    console.log("You bought stuff");
    console.log(x);
    this.personServices.getById(x).subscribe(
      returnedPerson => {
        this.previous! = returnedPerson.previous!;
        console.log(this.previous);
      }
    )
  }


}

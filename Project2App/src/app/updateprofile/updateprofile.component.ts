import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PersonService } from '../services/person.service';
import { SessionService } from '../services/session.service';
import { CookieService } from 'ngx-cookie';
import { Person, Product, ProductCart } from '../interfaces';
import { Cart } from '../interfaces';

@Component({
  selector: 'app-updateprofile',
  templateUrl: './updateprofile.component.html',
  styleUrls: ['./updateprofile.component.css']
})
export class UpdateprofileComponent implements OnInit {
  person!: Person;

  constructor(private personService: PersonService, private cookieService: CookieService) { }

  ngOnInit(): void {
    this.person = {
      id!: Number(this.cookieService.get("userId")),
      name:"",
      address: "",
      email:""  
    }
    
    
    this.updateProfile(this.person);
    
    
  }

  updateProfile(person:Person){
    console.log("You are updating");
    this.personService.updateProfile(person).subscribe(
      returnedPerson => {
        person = returnedPerson;
      }
    )
  }

}

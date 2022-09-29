import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {Person} from '../interfaces';
import { PersonService } from '../services/person.service';
import { SessionService } from '../services/session.service';
import { CookieService } from 'ngx-cookie';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
 

  constructor(private personService:PersonService, private cookieService:CookieService) { }

  person!: Person;


  ngOnInit(): void {
    this.person = { 
      id: Number(this.cookieService.get("userId")),
      name: "",
      username: "",
      address: "",
      email: ""
    
    }

    this.getById()

  }

  
  getById(){
    this.personService.getById(this.person.id).subscribe(
      returnPerson => {
        this.person = returnPerson;
      }
    )
  }

}

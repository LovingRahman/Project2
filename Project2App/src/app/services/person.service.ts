import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { mergeMap, Observable } from 'rxjs';
import {url} from '../endpoint';
import {Person} from '../interfaces';
import { Cart } from '../interfaces';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor(private http:HttpClient) { }

  public login(person:Person):Observable<Person> {
    return this.http.post<Person>(`${url}/people?auth=login`, person);
  }

  public register(person:Person):Observable<Person> {
    return this.http.post<Person>(`${url}/people?auth=register`, person);
    
  }

  public addToCart(personId: Number, productId: Number, quantity: Number): Observable<Cart> {
    return this.http.patch<Person>(`${url}/people/${personId}/products/${productId}?quantity=${quantity}`,{});

  }

  public getById(personId?: Number): Observable<Person> {
    return this.http.get<Person>(`${url}/people/${personId}`);
    
  }

  public checkout(personId?: Number) {
    return this.http.patch<Person>(`${url}/people/${personId}`,{});
  }

  public getPastOrder(personId: Number): Observable<Person>{
    return this.http.get<Person>(`${url}/people/previous/${personId}`)
  }

  public updateProfile(person:Person): Observable<Person>{
    return this.http.patch<Person>(`${url}/people/update`,person);
  }


  
}

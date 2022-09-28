import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { mergeMap, Observable } from 'rxjs';
import {url} from '../endpoint';
import {Product} from '../interfaces';
import {Person} from '../interfaces';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) {}

  public getAllProducts(): Observable<Product[]>{
      return this.http.get<Product[]>(`${url}/products`);
  }
   
}

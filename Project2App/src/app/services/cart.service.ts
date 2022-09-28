import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { mergeMap, Observable } from 'rxjs';
import {url} from '../endpoint';
import { Cart } from '../interfaces';


@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private http:HttpClient) { }

  public addToCart(cart:Cart,productId:Number,quantity:Number){

  }
}

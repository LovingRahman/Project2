// import { Component, OnInit } from '@angular/core';
// import { Person } from '../interfaces';
// import { PersonService } from '../services/person.service';
// import { Cart } from '../interfaces';
// import { Product } from '../interfaces';
// import { CookieService } from 'ngx-cookie';


// @Component({
//   selector: 'app-add-to-cart',
//   templateUrl: './add-to-cart.component.html',
//   styleUrls: ['./add-to-cart.component.css']
// })
// export class AddToCartComponent implements OnInit {
  

//   constructor(private personService:PersonService, private cookieService:CookieService) { }

//   current!:Cart;
//   products!: Product;

//   personId!: Number;
//   productId!: Number;
//   quantity!: Number;

//   ngOnInit(): void {
//     this.personId = Number(this.cookieService.get("userId"));
//   }

//   addToCart(){
//     this.personService.addToCart(this.personId,this.productId,this.quantity).subscribe(
//       returnedCart => {
//       this.current = returnedCart;
//       }
//     )
      
//   }



    
  

// }

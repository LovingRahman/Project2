import { Component, OnInit } from '@angular/core';
import { Product } from '../interfaces';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-getallproducts',
  templateUrl: './getallproducts.component.html',
  styleUrls: ['./getallproducts.component.css']
})
export class GetallproductsComponent implements OnInit {

  products!: Product[];

  constructor(private productService:ProductService) { }

  ngOnInit(): void {

    this.productService.getAllProducts().subscribe(
      returnProducts => {
        this.products = returnProducts;
      }
    )
  }

}

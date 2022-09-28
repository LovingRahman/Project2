// In this file, we will define any interface we need in the project
// Because we're using these interfaces throughout our project, we define them here and import them wherever we need it:
export interface Pet {
    id: Number,
    name: String,
    species: String,
    food: String
}

// store the structure/interface of our Person objects
export interface ProductCart {
    id?: Number,
    product: Product,
    quantity:Number,
}

export interface Product {
    id?: Number,
    name: String,
    description: String,
    price: Number,
    quantity: Number,
    productcartlist?: ProductCart[],

}

export interface Cart {
    id?: Number,
    productsInCart?: ProductCart[],

}

export interface Person {
    id?: Number,
    name?:String,
    username?:String,
    password?: String,
    address?:String,
    email?:String,
    current?:Cart,
    previous?:Cart[],

}
 


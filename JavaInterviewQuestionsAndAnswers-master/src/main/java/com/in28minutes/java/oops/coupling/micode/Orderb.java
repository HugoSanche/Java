package com.in28minutes.java.oops.coupling.micode;

public class Orderb {
    private float salesTax;
    private ShoppingCartb carb;

    public Orderb(float salesTax, ShoppingCartb shoppingCartb) {
        this.salesTax = salesTax;
        this.carb = shoppingCartb;
    }

    public float totalPrice(){
        float carTotalPrice=0;

        for (int i=0; i<carb.items.length; i++){
            carTotalPrice=carb.items[i].price*carb.items[i].quantity;
        }
        carTotalPrice=carTotalPrice*salesTax;
        return carTotalPrice;
    }
}

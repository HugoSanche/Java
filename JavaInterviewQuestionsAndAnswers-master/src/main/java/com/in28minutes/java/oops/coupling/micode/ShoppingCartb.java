package com.in28minutes.java.oops.coupling.micode;

public class ShoppingCartb {
    public   ShoppingCartEntryb [] items;

    public float getShoppingCart(){
        float price=0;
        for (int i=0; i<items.length; i++){
           price+= items[i].getPrice();
        }
        return price;
    }
}

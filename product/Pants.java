package product;

//this variables will be extends from class products
/* 
private double price;
private String color;
private String brand;
*/


public class Pants extends Product { //the class Pants extends from productos

    private int waist;
    private int length;


    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }



}

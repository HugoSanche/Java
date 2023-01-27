
package product;

public class Shirt extends Product{
    //this variables will be extends from class products
/* 
private double price;
private String color;
private String brand;
*/


    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}


    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
  

}

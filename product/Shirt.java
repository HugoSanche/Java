
package product;

public class Shirt extends Product{
    //this variables will be extends from class products
/* 
private double price;
private String color;
private String brand;
*/
    public Shirt(double price, String color, String brand,Size size) {
        super(price, color, brand);
        this.size = size;
    }

    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}


    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
  
    @Override
    public void fold(){
        super.fold(); //se puede invocar metodos de la clase padre
        System.out.println("Estoy en la clase "+this.getClass().getSimpleName().toLowerCase() +" sobre escribiendo el methodo fold de la clase Product");
    }
    public void wear(){
        System.out.println("Esta playera se te ve bien en el tamaño "+this.size);
    }
    public String toString(){
        return ("El pantalon "+this.size+" "+this.getBrand()+" "+this.getColor()+" "+this.getPrice());
    }
}

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

    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        this.waist = waist;
        this.length = length;        
    }

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
    @Override
    public void fold(){
        super.fold(); //se pude invocar methodos de la clase padre
        System.out.println("Estoy en la clase "+this.getClass().getSimpleName().toLowerCase()+ " sobre escribiendo el metodo fold de la clase Product");
    }
    public void wear(){
        System.out.println("Este pantalon con la talla "+this.waist+ " se te ve muy bien "+" y con el largo "+this.length+ " se ve genial");
    } 
    @Override
    public String toString(){
        return ("The Pans "+this.length+" "+this.waist+" "+this.getBrand()+" "+this.getColor()+" "+this.getPrice());
    }
}

import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class MainProduct {
    public static void main(String[] args) {
        //Observa que no tiene sentido instanciar la clase Product
        //Si pones la clase Product como abstracta ya no te permirmite instanciarla 
        //Product producto=new Product(432,"Verde","Marca desconocida");
   
        Shirt playera1 =new Shirt(450,"red","Levis",Size.MEDIUM);
        playera1.fold();
        storedProduct(playera1);
        System.out.println(playera1);

        Pants pantalones1= new Pants(1450,"Blue","Furor",32, 34);
        pantalones1.fold();
        storedProduct(pantalones1);
        System.out.println(pantalones1);
    }
    //checa como un producto toma diferentes formas
    public static void storedProduct(Product producto){
        System.out.println("Thanks for purchasing "+producto.getBrand()+". "+producto.getClass().getSimpleName()+". "+"your total comes to "+producto.getPrice());
        producto.wear();
    }
}

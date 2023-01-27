import product.Pants;
import product.Shirt;
import product.Shirt.Size;

public class MainProduct {
    public static void main(String[] args) {
        Shirt playera1 =new Shirt();

        playera1.setBrand("Levis");
        playera1.setColor("Dark");
        playera1.setPrice(450.50);
        playera1.setSize(Size.MEDIUM);
        playera1.fold();

        Pants pantalones1= new Pants();
        pantalones1.setColor("Dark");
        pantalones1.setBrand("Furor");
        pantalones1.setLength(32);
        pantalones1.setPrice(1550);
        pantalones1.setWaist(36);
        pantalones1.fold();
        
    }

}

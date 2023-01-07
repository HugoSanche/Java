public class Main {
    public static void main(String[] Args){
        Car toyota= new Car("Toyota",323000,2018,"Red");
        Car honda=new Car("Honda",350000,2019,"Blue");

        toyota.setColor("White");
        honda.setColor("Black");

        toyota.setPrice(toyota.getPrice()/2);
        honda.setPrice(honda.getPrice()/2);

        System.out.println("This " + toyota.getMake() + " is worth $" + toyota.getPrice() + 
        ". It was built in " + toyota.getYear() + ". It is " + toyota.getColor() + ".\n");
        System.out.println("This " + honda.getMake() + " is worth $" + honda.getPrice() + 
        ". It was built in " + honda.getYear() + ". It is " + honda.getColor() + ".\n");
    }
    
}

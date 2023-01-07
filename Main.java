public class Main {
    public static void main(String[] Args){
        Car toyota= new Car("Toyota",323000,2018,"Red");
        Car honda=new Car("Honda",350000,2019,"Blue");

        System.out.println("This " + toyota.make + " is worth $" + toyota.price + 
        ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");
        System.out.println("This " + honda.make + " is worth $" + honda.price + 
        ". It was built in " + honda.year + ". It is " + honda.color + ".\n");
    }
    
}

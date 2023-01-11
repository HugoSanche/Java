public class Main {
    public static void main(String[] Args){
        Car toyota= new Car("Toyota",323000,2018,"Red");
        Car honda=new Car("Honda",350000,2019,"Blue");

        Car toyota2 = new Car(toyota);

        toyota2.setColor("Yellow");
        toyota.setColor("Orange");
        toyota2.setColor("Blue");
        toyota.setColor("Purple");
        toyota2.setColor("Fuchsia");
        toyota.setColor("Beige");
        
        

        toyota.setPrice(toyota.getPrice()/2);
        honda.setPrice(honda.getPrice()/2);

        toyota.drive();
    }
    
}

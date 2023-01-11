public class Main {
    public static void main(String[] Args){
        String[] spareParts=new String[] {"Tires","Keys"};

        Car toyota= new Car("Toyota",323000,2018,"Red",spareParts);
        Car honda=new Car("Honda",350000,2019,"Blue",spareParts);

        Car toyota2 = new Car(toyota);

       
        System.out.println(toyota);
        

        toyota.setPrice(toyota.getPrice()/2);
        honda.setPrice(honda.getPrice()/2);

        toyota.drive();
    }
    
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Animal animal= new Animal(); //error

       // Animal animal2=new Animal("Chabelo");
      //  Dog dog=new Dog();
        Animal dog1=new Dog();
       // System.out.println(dog.getName());

       // dog.ruidoAnimal();
        dog1.ruidoAnimal();

        Animal gato =new Animal("Minino"){
            @Override
            public void ruidoAnimal() {
                System.out.println("Maullando");
            }
        };
        gato.ruidoAnimal();
    }
}
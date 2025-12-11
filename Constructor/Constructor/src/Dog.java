public class Dog  extends Animal{
    public Dog(){
        super("DOGGO");
        System.out.println("DOG");
    }

    @Override
    public void ruidoAnimal() {
        System.out.println("Ladrandoooo");
    }
}

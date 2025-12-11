public class Animal {

    //java provide default constructor without arguments
//    public Animal(String name){
//
//    }
    private String name;
    public Animal(String name){
        this.name=name;
        System.out.println("Animal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void ruidoAnimal(){
        System.out.println("Animal haciendo ruido");
    }
}

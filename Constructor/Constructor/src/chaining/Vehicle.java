package chaining;

public class Vehicle {
    private String name;
    private Integer year;

    public Vehicle(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(){
        //Ejemplo de chaining constructor
        //llama al constructor con el mismo parametro
        this("Vento");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        System.out.println(vehicle.getName());
    }
}

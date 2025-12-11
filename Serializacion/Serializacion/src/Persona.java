import java.io.Serializable;

public class Persona implements Serializable {
    private String name;
    private int edad;
    private transient String ciudad; //esta variable no se puede serializar

    Animal animalDomestico;

    public Persona(String name, int edad, String ciudad, Animal animalDomestico) {
        this.name = name;
        this.edad = edad;
        this.ciudad = ciudad;
        this.animalDomestico = animalDomestico;
    }

    public Animal getAnimalDomestico() {
        return animalDomestico;
    }

    public void setAnimalDomestico(Animal animalDomestico) {
        this.animalDomestico = animalDomestico;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public static String pais;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                ", animalDomestico=" + animalDomestico +
                '}';
    }
}

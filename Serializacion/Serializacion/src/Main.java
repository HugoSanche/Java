import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona persona=new Persona("Hugo",35,"Puebla",new Animal("Osito"));
        Persona.pais="Mexico";

        //Serializacion
        FileOutputStream fileOutputStream=new FileOutputStream("Persona.txt");
        ObjectOutputStream objectOutStream=new ObjectOutputStream(fileOutputStream);
        objectOutStream.writeObject(persona);
        objectOutStream.close();

        //Deserealizacion
        FileInputStream fileInputStream=new FileInputStream("Persona.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Persona personaEnFichero=(Persona) objectInputStream.readObject();

        System.out.println("Persona deserializada: "+personaEnFichero);
    }
}
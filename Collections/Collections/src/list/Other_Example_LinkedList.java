package list;

import java.util.Collections;
import java.util.LinkedList;

public class Other_Example_LinkedList {
    public static void main(String[] args) {
        Perro newPerro=new Perro("Tito",10);
        Perro newPerro1=new Perro("Kaliman",5);
        Perro newPerro3=new Perro("Verito",2);
        Perro newPerro4=new Perro("Albert",3);
        Perro newPerro2=new Perro("Natata",6);

        LinkedList<Perro> listaPerros=new LinkedList<>();
        listaPerros.add(newPerro1);
        listaPerros.add(newPerro);
        listaPerros.add(newPerro2);
        listaPerros.add(newPerro3);
        listaPerros.add(newPerro4);

        ////para que esto funcione debes de implmentar Comparable<Perro> en la clase Perro
        Collections.sort(listaPerros);

        System.out.println(listaPerros);

    }
}

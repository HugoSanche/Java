package deque_queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Example_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque=new ArrayDeque<>();

        arrayDeque.add("Rocio");
        arrayDeque.add("Catalina");
        arrayDeque.add("Azul");
        arrayDeque.add("Arely");
        arrayDeque.add("Miriam");
        System.out.println("********************************************");
        for(String name:arrayDeque){
            System.out.println(name);
        }
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        arrayDeque.addFirst("Noe");
        arrayDeque.addLast("Hugo");

        Iterator<String> iterator=arrayDeque.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------------------------------");

        System.out.println("Primer Elemento: "+arrayDeque.getFirst());
        System.out.println("Ultimo Elemento: "+arrayDeque.getLast());


        System.out.println("-------------------------------------------------------");

        //obtiene primer y ultimo elemento pero no borra
        System.out.println(""+arrayDeque.peekFirst());
        System.out.println(""+arrayDeque.peekLast());
        System.out.println("-------------------------------------------------------");

        arrayDeque.forEach(a-> System.out.println(a));

        System.out.println("-------------------------------------------------------");

        //obtiene primer y ultimo elemento y despues los borra
        System.out.println(""+arrayDeque.pollFirst());
        System.out.println(""+arrayDeque.pollLast());
        System.out.println("-------------------------------------------------------");

        arrayDeque.forEach(a-> System.out.println(a));
    }
}

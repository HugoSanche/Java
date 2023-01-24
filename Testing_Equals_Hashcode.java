
import java.util.*;

public class Testing_Equals_Hashcode {
    public static void main(String[] args) {
        Contact contact =new Contact("Hugo", 30);
        Contact contactCopy=new Contact(contact);

        System.err.println("First Hashcode "+ contact.hashCode());
        System.out.println("Second Hashcode "+contactCopy.hashCode());

        //Checa que al crear un nuevo objecto cambia la referencia, Aun que tenga los mismos valores
        //el hashcode sera diferente y por lo tanto regresara que no son iguales.
        //Equals checa valor de referencia

        //Si sobre-escribes equals y hashcode en contact generara un hascode de acuerdo al nombre y a la edad.
        //te regresara que son iguales.


        /************Equals****** */

        System.out.println("Equality: "+ contact.equals(contactCopy));

        /**************************HashCode and Equals *************/    
        Map<Contact,String> peopleMap=new HashMap<>();
        peopleMap.put(new Contact(contactCopy),"Ciudad Azteca");
        peopleMap.put(new Contact("Karina",30),"1806 street new york");
        peopleMap.put(new Contact("Veronica",32),"San jeronimo puebla");
        peopleMap.put(new Contact("Janneth",31),"Division del norte Cidad de mexico");
    
        System.out.println("\n Hugo's address is :"+peopleMap.get(new Contact("Hugo",30)));
        System.out.println("\n Karina's addres is :"+peopleMap.get(new Contact("Karina",30)));


        System.out.println("\n Is Karina, 31 years of age, in my contacts?");
        String response=peopleMap.containsKey(new Contact("Veronica",32)) ? "yes!" : "No, sorry";
        System.out.println(response);
    }

}
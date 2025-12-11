import java.util.HashSet;
import java.util.Set;

public class Test_inmutableClass {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        set.add(1); set.add(3);

        InmutableClass obj=new InmutableClass(100,"Hugo", set );

        int id=obj.getId();
        String name=obj.getName();
        System.out.println("Id "+id);
        System.out.println("Name "+name);

        System.out.println("************************");
        id=200;
        name="Veronica";
        set.add(7);
        System.out.println("Id "+id);
        System.out.println("Name "+name);
        System.out.println("Set "+set);

        System.out.println("Id "+obj.getId());
        System.out.println("Name "+obj.getName());
        System.out.println("Set "+obj.getSet());

    }
}

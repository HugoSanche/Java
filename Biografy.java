import javax.security.auth.Subject;

public class Biografy {
    public static void main (String[] Args){
        String name="Hugo";
        int year=42;
        String city="Mexico";
        String favoriteSport="Formula 1";
        int hoursPlay=1;
        String hobby="Study about proggraming";
        String subject="Algoriths";
        char score='A';
        System.out.println("My names is "+name+". I'm "+year+" years old, and i'm from "+city);
        System.out.println("My favorite Sport is "+favoriteSport +". I play for "+hoursPlay+" hour a day");
        System.out.println("When i'm tired, i like to play "+hobby);
        System.out.println("In school, my favorite subject was "+subject+" I sored a "+score);
    }
}

public class BeforeAfterIncrement {
    public static void main(String[] args) {
        int i=5;

        //primero incrementa i y despues asigna el valor
        int resultado=++i;
        //output 6
        int j=5;
        System.out.println(resultado);

        //primero asigna valor a resultado y despues incrementa
        int resultado2=j++;
        //output 5
        System.out.println(resultado2);
    }
}

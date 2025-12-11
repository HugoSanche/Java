package otherExample._throws;

public class Main {
    public static void main(String[] args) {

        try {
            AmountAdder_Other.adderAmount(new Amount("Peso", 17), new Amount("Dollar", 20));
        }
        //Primero va el catch mas especifico
        catch (RuntimeExceptionEqualsAmount e){
            System.out.println("Currency does not match");

        //despues va el catch mas general
        } catch (Exception ee){
            System.out.println(ee);
        }
        finally {
            System.out.println("Siempre se executa");
        }
    }

}





















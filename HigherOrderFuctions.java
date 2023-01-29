public class HigherOrderFuctions{

    public static int doTwise(IntUnaryfunction f, int x){
        return f.apply(x);
    }
    public static void main(String[] Args){
        Tendx tendx =new Tendx();

        System.out.println(doTwise(tendx,2));
    }
}
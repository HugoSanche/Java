public class Scope {
    static int dogs=10; //check gogs is declared "static"
    public static void main(String[] Args){
        int apples=5;
        System.out.println(dogs);

       // System.out.println(pineaples);//you cannot acceses pineaples

       System.out.println(apples);
    }
    public static void somefuction(){
        int pineaples=2;
        //System.out.println(apples); //cannot acceses apples 
        System.out.println(pineaples); //you can aacces pineaples
    }
}

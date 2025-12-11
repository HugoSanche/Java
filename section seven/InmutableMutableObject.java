public class InmutableMutableObject{
    public static void main(String[] Args){

        //mutuable
        String test="Hugo";
        System.out.println(test);
        
        test="Baltazar";
        System.out.println(test);

        String text1=test;
        
        text1="Sanchez";
        System.out.println("----");
        System.out.println(test);
        System.out.println(text1);
        int x=null;
        
        int[] z = new int[3];

        int[] b = null;
    }
}
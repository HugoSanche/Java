public class AutoBoxing {
    public static void main(String[] args) {
        Integer nineA=new Integer(9);
        Integer nineB= new Integer(9);
        System.out.println(nineA==nineB);//false
        System.out.println(nineA.equals(nineB)); //true

        //Two wrapper object created using bocing ara same object

        //Auto Boxing
        Integer nineC=9;
        Integer nineD=9;

        System.out.println(nineC==nineD);//true
        System.out.println(nineC.equals(nineD));//true

        Integer hundred=Integer.valueOf("100");
        Integer seven =Integer.valueOf("111",2); //binary 111 is convert to 7

        System.out.println(seven);

        Integer ocho=8;
        int ocho2= ocho;

    }
}

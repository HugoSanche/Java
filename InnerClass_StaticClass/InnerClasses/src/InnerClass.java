public class InnerClass {

    public static void main(String[] args) {

        InnerClass innerClass=new InnerClass();
        InnerClass.InsideOtherClass insideOtherClass=innerClass.new InsideOtherClass();
        //InnerClass.InsideOtherClass test1=new InsideOtherClass();
       //InnerClass.InsideOtherClass test2=new InnerClass.InsideOtherClass();

    }
    private int a1;
    private final int a2=0;
    public int a3=3;

    public void method_A(){
         int x1;
         final int x2=0;
         int x3;
    }

    public class InsideOtherClass{
        private int b1;
        private final int b2=2;
        public int b3;

        public void method_B(){
            int y1;
            final int y2=0;
            int y3=3;

            //class padre
            a1=3;
            System.out.println(a2);
            a3=3;

            b1=4;
            System.out.println(b2);
            b3=5;
        }
    }

    //Class hija
    InnerClass.InsideOtherClass test1=new InsideOtherClass();
    InnerClass.InsideOtherClass test2=new InnerClass.InsideOtherClass();

    //class padre

}

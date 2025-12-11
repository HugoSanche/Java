public class OuterInnerClass {
    private Integer total=10;
    public class InnerClassExample{
        public void showVariable(){
            // si tiene acceso a total aun se declaro privada en la principal clase
            System.out.println(total);
        }
    }
    public static void main(String[] args) {
        OuterInnerClass outer=new OuterInnerClass();
        InnerClassExample inner=outer.new InnerClassExample();
        inner.showVariable();
    }
}

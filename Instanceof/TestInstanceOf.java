public class TestInstanceOf {

    public static void main(String[] args) {

        SubClass subClass=new SubClass();
        Object superClass=new SuperClass();
        OtherClass otherClass=new OtherClass();
        System.out.println(subClass instanceof SuperClass);
        System.out.println(superClass instanceof Object);
        System.out.println(otherClass instanceof Interface);
        System.out.println(subClass instanceof Object);
    }
}

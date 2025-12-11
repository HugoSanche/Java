public class Example2 {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    public static int testMethod(){
        try{
            System.out.println("In Try Block");
            return 1;
        }
        catch(Exception e){
            System.out.println("Try executes");
            return 2;
        }
        finally {
            System.out.println("Finally executes");
        }
    }
}

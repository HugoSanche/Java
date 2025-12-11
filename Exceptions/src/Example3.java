import java.security.InvalidParameterException;

public class Example3 {

        public static void main(String[] args) {
            System.out.println(testMethod());
        }

        public static int testMethod(){
            try{
                throw new InvalidParameterException("Exception in try block");
            }
            catch(Exception e){
                throw new InvalidParameterException("Exception in catch block");
            }
            finally {
                throw new InvalidParameterException("Exception in finally block");
            }
        }

}

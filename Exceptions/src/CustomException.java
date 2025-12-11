public class CustomException {
    public static void main(String[] args) throws AgeLessThanZeroException {
        int age=1;
       checkAge(age);
    }
    public static void checkAge(int age) throws AgeLessThanZeroException{
        if (age<0){
            throw new AgeLessThanZeroException("Age less than zero",new RuntimeException());
        }

    }
}

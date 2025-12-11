public class TestQuestions {
    public static void main(String[] args) {
        Questions questions=new Questions();

        System.out.println("Sum of digits");
        int result=questions.sumofDigits(175);
        System.out.println(result);

        System.out.println("Power ");
        int result2=questions.power(2,3);
        System.out.println(result2);

        System.out.println("GCD ");
        int result3=questions.gcd(48,18);
        System.out.println(result3);

    }
}

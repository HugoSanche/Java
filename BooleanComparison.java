class BooleanComparison{
    public static void main(String[] Args){
        int chemestryGrades=85;
        int biologyGrades=80;
        int englishGrade=80;

        System.out.println(chemestryGrades>=englishGrade);

        System.out.println(chemestryGrades!=englishGrade);
        System.out.println(biologyGrades!=englishGrade);

        String sentence="I love Java";
        String sentence2="I love Java";

        System.out.println(sentence.equals(sentence2));
        System.out.println(!sentence.equals(sentence2));


        double value = 3.6;
System.out.println((int)value == 3);
    }
}
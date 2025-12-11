import java.time.LocalDate;
import java.util.*;

public class Exercises {


    public static void main(String[] args) {
        Exercises execute =new Exercises();
       // execute.invertString("Baltazar");
     //   execute.isPalindroma("hugo");
      //  execute.invert("Baltazar");

        //execute.isCapicua(5251);
       // execute.counterCharacter("Baltazar");
       // execute.isMultiplo(11);

        //execute.isLapLear(2020);
        //execute.randomString("sanchez");
        //execute.onlyNotDuplicatesList(Arrays.asList(1,5,2,4,9,8,4,6,7,2,3,7));
        //execute.checkExistVowel("klyt");
       boolean result=execute.isPalindroma2("radar");
        System.out.println(result);
    }
    public void invertString(String string){
        String[] arrayText=string.split("");
        System.out.println(Arrays.toString(arrayText));
        StringBuilder texto= new StringBuilder();
        for (int i=arrayText.length-1; i>=0; i--){
            texto.append(arrayText[i]);
        }
        System.out.println(texto);

        //other way
        StringBuilder texto2= new StringBuilder(string).reverse();
        System.out.println(texto2);
    }
    public void isPalindroma(String string){

        for (int i=0; i<string.length()/2; i++){
            if (string.charAt(i)!=string.charAt((string.length()-1)-i)){
                System.out.println("No es Palindroma");
                return;
            }
        }
        System.out.println("Es palindroma");
    }
    public void invert(String string){
        String[] myString=string.split("");
        StringBuilder text=new StringBuilder();
        for (int i=myString.length-1;i>=0;i--){
            text=text.append(myString[i]);
        }
        System.out.println(text);
    }
public void isCapicua(int number){
        String stringNumber=String.valueOf(number);
        String texto=new StringBuilder(stringNumber).reverse().toString();
        if (stringNumber.equals(texto)){
            System.out.println("Its capicua");
        }else{
            System.out.println("Its not capicua");
        }
}
public void counterCharacter(String text){
        int counter[]=new int [256];
        for (int i=0; i<text.length(); i++){
            counter[text.charAt(i)]++;
        }
        for (int i=0; i<256; i++){
           // System.out.println("X");
            if (counter[i]!=0){
                System.out.println((char)i+" : "+counter[i]);
            }
        }
    }
    public void isMultiplo(int number){
        if (number % 2==0){
            System.out.println("Es multiplo");
        }
        else{
            System.out.println("No es multiplo");
        }
    }
    public void isLapLear(int year){
        boolean isLapYear= LocalDate.of(year,1,1).isLeapYear();
        if (isLapYear){
            System.out.println(" is lap year");
        }else{
            System.out.println("No is lap year");
        }
    }
    public void randomString(String text){
        String[] string=text.split("");
        List<String> list=Arrays.asList(string);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }
    public void onlyNotDuplicatesList(List<Integer> list){
        Set<Integer> noDuplicates=new HashSet<>(list);
        noDuplicates.forEach(System.out::println);
    }
  public void checkExistVowel(String string){
        String[] text=string.split("");
        boolean result=string.matches(".*[aeiou].*");
        //other way
        boolean result2=Arrays.stream(text).anyMatch(s -> s.equals("a") ||s.equals("e") || s.equals("i") || s.equals("o")||s.equals("u"));
        System.out.println(result);
        System.out.println(result2);
    }
    public boolean isPalindroma2(String string){
            for (int i=0; i<string.length()/2; i++){
                if (string.charAt(i)!=string.charAt(string.length()-i-1)){
                    return false;
                }
            }
            return true;
    }
}

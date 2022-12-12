public class ReturnValue {
    public static void main(String[] Args){
       double area= calculateArea(2.5, 3.1);
      // double area2= calculateArea(1.2, 2.1);
      // double area3=calculateArea(1.2, 1.4);
       
      // String spanishExplanation=explainArea("Spanish");
       
       //String frenchExplanation=explainArea("French");

       printArea(2.5,3.1,area);
       String englishExplanation=explainArea("English");
       System.out.println(englishExplanation);
    }
    public static double calculateArea(double lenght, double width ){
        if (lenght <0 || width<0){
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }
        double area=lenght*width;
        return area;
    }

    public static String explainArea(String languaje){
        switch(languaje){
            case "Spanish": return "Area es igual a largo * ancho";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "English": return "Area equals length * width";
            default: return "Languaje no avaliable";
        }
    }
    public static void printArea(double lenght, double width, double area){
        System.out.println("A rentangle with a lenght of "+lenght+" and width of "+width+" has an Area of "+area);
    }
}

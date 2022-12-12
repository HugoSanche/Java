public class Parameters {
    public static void main(String[] Args){
        calculateArea(2.5, 3.1);
        calculateArea(1.2, 2.1);
    }
    public static void calculateArea(double lenght, double width ){
        double area=lenght*width;
        System.out.println("Area : "+area);
    }
}

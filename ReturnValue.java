public class ReturnValue {
    public static void main(String[] Args){
       double area= calculateArea(2.5, 3.1);
       double area2= calculateArea(1.2, 2.1);
        System.out.println("Area : "+area);
        System.out.println("Area2 : "+area2);
    }
    public static double calculateArea(double lenght, double width ){
        double area=lenght*width;
        return area;
    }
}

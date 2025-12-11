import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Thank you for using the area calculator");
        System.out.println("\nThis calculator lets you get the area of:");

        System.out.println("1 -- Square");
        System.out.println("2 -- Rectangle");
        System.out.println("3 -- Triangle");
        System.out.println("4 -- Circle");
        int option=scan.nextInt();
        switch(option){
            case 1: 
                System.out.println("Please, give me the side ");
                Double sideSquare=scan.nextDouble();
                double square= areaSquare(sideSquare);
                printArea("Square", square);
            break;
            case 2: 
                System.out.println("Please, give me the lenght ");
                Double lenghtRentangle=scan.nextDouble();

                System.out.println("Please, give me the width ");
                Double widthRentangle=scan.nextDouble();

                double rentangle= areaRectangle(lenghtRentangle, widthRentangle);
                printArea("Rentangle", rentangle);
                break;
            case 3: 
                System.out.println("Please, give me the base ");
                Double baseTriangle=scan.nextDouble();

                System.out.println("Please, give me the height ");
                Double heightTriangle=scan.nextDouble();

                double triangle= areaTriangle(baseTriangle, heightTriangle);
                printArea("Triangle", triangle);
            break;
            case 4: 
                System.out.println("Please, give me the radious ");
                Double radiousCircle=scan.nextDouble();
                double circle= areaSquare(radiousCircle);
                printArea("Circle", circle);
            break;
        }
        
    }
    public static double areaSquare(double side){
        if (side <1){
            System.out.println("Its impossible");
            System.exit(0);
        }
            return  Math.pow(side, 2);
    }

    public static double areaRectangle(double length, double width){
        if (length<0 || width<0){
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return length*width;
    }
    public static double areaTriangle(double base, double height ){
        if (base<0 || height<0){
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return base*height/2;
    }

    public static double areaCircle(double radious ){
        if (radious<0){
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return Math.PI* radious;
    }
    public static void printArea(String tipeShape, double area){
        System.out.println(tipeShape+" area: "+area);
       
    }
}


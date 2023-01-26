import static java.lang.Math.PI; //tienes que decirle que lo que importas es tipo static
import static java.lang.Math.pow; //checa como llamar un metodo static

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {

        //return 2 * Math.PI * radius;
        return 2 * PI * radius; //checa como ya no es necesario Math
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getLargerRadius(double otherRadius) {
        return Math.max(radius, otherRadius);
    }

    public double getSmallerRadius(double otherRadius) {
        return Math.min(radius, otherRadius);
    }

    public double getRadiusSquared() {
        //return Math.pow(radius, 2); 
        return pow(radius, 2); //Al importar pow ya no es necesario Math
    }

    public double getRadiusSquareRoot() {
        return Math.sqrt(radius);
    }

}
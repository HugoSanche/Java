import java.util.Arrays;

class Car{
   private String make;
   private double price;
   private int year;
   private String color;
   private String[] spareParts;


    public Car(String make, double price, int year, String color, String[] spareParts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length);
    }

    public String[] getSpareParts() {
        return Arrays.copyOf(this.spareParts, this.spareParts.length);
    }

    public void setSpareParts(String[] spareParts) {
      Arrays.copyOf(this.spareParts, this.spareParts.length);
    }

    @Override
    public String toString() {
        return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(spareParts) + ".\n";

    }


//copy constructor
public Car(Car source){
    this.make=source.make;
    this.price=source.price;
    this.year=source.year;
    this.color=source.color;
}
public String getMake(){
    return make;
}
public void setMake(String make){
    this.make=make;
}

public double getPrice(){
    return price;
}
public void setPrice(double price){
    this.price=price;
} 

public int getYear(){
    return year;
}
public void setYear(int year){
    this.year=year;
}

public String getColor(){
    return color;
}
public void setColor(String color){
    this.color=color;
}

public void drive(){
    System.out.println("You bought the beatiful "+this.year+" "+this.color+" "+this.make+" for "+ this.price);
    System.out.println("Please start your engine and go home");
}
}
package model;
public class Car {
    private String make;
    private int year;

    //Enum permite detectar errores en tipo de compilacion y no en tiempo de ejecucion
    public enum trafficLight{GREEN,RED,YELLOW};

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void drive(trafficLight light) {
        if (light==null) {
            throw new IllegalArgumentException("TRAFFIC LIGHT CAN NOT BE NULL");
        }

        switch (light) {
            case RED: System.out.println("STOP"); break;
            case GREEN: System.out.println("DRIVE"); break;
            case YELLOW: System.out.println("SLOW DOWN"); break;
        }
    }

    // public void drive(TrafficLight trafficLight) {
    //     if (trafficLight == null) throw new IllegalArgumentException("Traffic Light cannot be null");
    //     switch (trafficLight) {
    //         case RED: System.out.println("STOP"); break;
    //         case GREEN: System.out.println("DRIVE"); break;
    //         case YELLOW: System.out.println("SLOW DOWN"); break;
    //     }
    // }


}

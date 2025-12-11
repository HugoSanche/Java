import model.Car;
import model.Car;
import static model.Car.trafficLight.*;

public class Enum {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive(YELLOW); //checa como importaste trafficLight
    }

}

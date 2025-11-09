import com.coderjd.inheritance.service.CarService;
import com.coderjd.inheritance.service.SportsCarService;

public class Main {
    public static void main(String[] args) {

        SportsCarService car = new SportsCarService();
        car.move();
        car.speeds();
        car.turbo();
    }
}

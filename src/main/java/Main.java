import Config.AppConfig;
import drivers.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import transport.Bus;
import transport.Car;
import transport.Pickup;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean("car", Car.class);
        Pickup pickup = context.getBean("pickup", Pickup.class);
        Bus bus = context.getBean("bus", Bus.class);
        car.start();
        pickup.start();
        bus.start();
        Driver driver = context.getBean("driver", Driver.class);
        Driver driver1 = context.getBean("driver2", Driver.class);
        Driver driver2 = context.getBean("driver3", Driver.class);
        driver.getInTheCar();
        driver1.getInTheCar();
        driver2.getInTheCar();
    }
}
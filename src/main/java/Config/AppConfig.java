package Config;

import drivers.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import transport.Bus;
import transport.Car;
import transport.Pickup;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Car getCarBean(){
        return new Car("Легковая машина");
    }
    @Bean(name = "pickup")
    public Pickup getPickupBean(){
        return new Pickup("Грузовая машина");
    }
    @Bean(name = "bus")
    public Bus getBusBean(){
        return new Bus("Автобус");
    }
    @Bean(name = "driver")
    @Scope("prototype")
    public Driver getDriver(){
        return new Driver("Петров Пётр Петрович",getCarBean());
    }
    @Bean(name = "driver2")
    @Scope("prototype")
    public Driver getDriver2(){
        return new Driver("Иванов Иван Иванович",getPickupBean());
    }
    @Bean(name = "driver3")
    @Scope("prototype")
    public Driver getDriver3(){
        return new Driver("Барановский Владислав Леонидович",getBusBean());
    }
}
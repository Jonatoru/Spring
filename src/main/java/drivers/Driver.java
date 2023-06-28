package drivers;
import transport.Transport;
import java.util.Objects;
import static Checks.ValidationUtilities.validateString;

public class Driver {
    private String fullNameOfTheDriver;
    private Transport transport;

    /**
     * @param fullNameOfTheDriver - ФИО водителя,
     * @param transport - Тип транспорта.
     */

    public Driver(String fullNameOfTheDriver, Transport transport) {
        this.fullNameOfTheDriver = validateString(fullNameOfTheDriver, "not name");
        this.transport = transport;
    }

    public  Driver(String fullNameOfTheDriver){
        this.fullNameOfTheDriver=validateString(fullNameOfTheDriver,"not name");
    }

    public String getFullNameOfTheDriver() {
        return fullNameOfTheDriver;
    }

    public void setFullNameOfTheDriver(String fullNameOfTheDriver) {
        this.fullNameOfTheDriver = fullNameOfTheDriver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(fullNameOfTheDriver, driver.fullNameOfTheDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullNameOfTheDriver);
    }

    @Override
    public String toString() {
        return "Водитель: "+ getFullNameOfTheDriver() + " сел в машину: "+ transport.getModel();
    }

    public void getInTheCar(){
        System.out.println("Водитель: "+ getFullNameOfTheDriver() + " сел в машину: "+ transport.getModel());
    }
}
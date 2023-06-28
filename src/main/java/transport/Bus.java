package transport;

public class Bus extends Transport {

    public Bus(String model) {
        super(model);
    }
    public void start(){
        System.out.println(getModel()+ " готов к работе.");
    }
    public String toString() {
        return  "Тарнспор: "+ getModel();
    }
}
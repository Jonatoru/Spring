package transport;

public class Pickup extends Transport {

    public Pickup(String model){
        super(model);
    }

    public void start(){
        System.out.println(getModel()+ " готов к работе.");
    }
    public String toString() {
        return  "Тарнспор: "+ getModel();
    }
}
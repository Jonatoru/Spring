package exceptions;

public class TransportTypeException extends RuntimeException{

    public TransportTypeException(){
        super();
    }
    public TransportTypeException(String massage){
        super(massage);
    }
    public TransportTypeException (String massage, Throwable t){
        super(massage, t);
    }
    public TransportTypeException(Throwable t){
        super(t);
    }
}
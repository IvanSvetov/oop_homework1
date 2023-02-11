package transport;

public class TransportTypeExeption extends RuntimeException{
    public TransportTypeExeption() {
    }
    public TransportTypeExeption(String message) {
        super(message);
    }
}

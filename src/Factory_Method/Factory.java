package Factory_Method;

public class Factory {

    public Transport getTransport(Transports transportsType) {
        if (transportsType == null) {
            return null;
        }
        if (Transports.SHIP == transportsType) {
            return new Ship();

        } else if (transportsType == Transports.TRUCK) {
            return new Truck();

        }
        return null;
    }
}
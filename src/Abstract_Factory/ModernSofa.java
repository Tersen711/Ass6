package Abstract_Factory;

public class ModernSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("modern sofa has 4 legs;");
    }

    @Override
    public void setOn() {
        System.out.println("can sit on modern sofa");
    }

    @Override
    public void hasSeats() {
        System.out.println("modern sofa has 5 seats;");
    }

    @Override
    public void lieOn() {
        System.out.println("can lie on modern sofa");
    }
}

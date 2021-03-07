package Abstract_Factory;

public class VictorianSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("victorian sofa has 8 legs");
    }

    @Override
    public void setOn() {
        System.out.println("victorian sofa has 4 seats");
    }

    @Override
    public void hasSeats() {
        System.out.println("can sit on victorian sofa");
    }

    @Override
    public void lieOn() {
        System.out.println("victorian sofa has 1 seat");
    }
}

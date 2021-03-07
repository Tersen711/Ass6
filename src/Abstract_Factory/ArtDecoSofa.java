package Abstract_Factory;

public class ArtDecoSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("artDeco sofa has 4 legs;");
    }

    @Override
    public void setOn() {
        System.out.println("can sit on artDeco sofa");
    }

    @Override
    public void hasSeats() {
        System.out.println("artDeco sofa has 5 seats;");
    }

    @Override
    public void lieOn() {
        System.out.println("can lie on artDeco sofa");
    }
}

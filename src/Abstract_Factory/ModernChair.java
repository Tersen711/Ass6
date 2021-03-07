package Abstract_Factory;

public class ModernChair implements Chair {
    @Override
    public void setOn() {
        System.out.println("can sit on Modern chair");
    }

    @Override
    public void hasSeats() {
        System.out.println("modern chair has two seats");
    }
}

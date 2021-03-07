package Abstract_Factory;

public class VictorianChair implements Chair{

    @Override
    public void setOn() {
        System.out.println("can sit on victorian chair");
    }

    @Override
    public void hasSeats() {
        System.out.println("victorian chair has 1 seat");
    }
}
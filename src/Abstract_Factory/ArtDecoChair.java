package Abstract_Factory;

public class ArtDecoChair implements Chair {

    @Override
    public void setOn() {
        System.out.println("can sit on artDeco");
    }

    @Override
    public void hasSeats() {
        System.out.println("actDeco Chair has two seats");
    }
}

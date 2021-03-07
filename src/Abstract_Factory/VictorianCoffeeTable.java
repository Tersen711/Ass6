package Abstract_Factory;

public class VictorianCoffeeTable implements CoffeeTable {

    @Override
    public void hasCoffee() {
        System.out.println("victorian coffee table has many coffee");
    }

    @Override
    public void hasCup() {
        System.out.println("victorian coffee table has 4 cups");
    }
}


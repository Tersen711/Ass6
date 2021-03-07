package Abstract_Factory;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void hasCoffee() {
        System.out.println("modern coffee table has many coffee");
    }

    @Override
    public void hasCup() {
        System.out.println("modern coffee table has 6 cups");
    }
}

package Abstract_Factory;

public class ArtDecoCoffeeTable implements CoffeeTable {

    @Override
    public void hasCoffee() {
        System.out.println("artDeco coffee table has many coffee");
    }

    @Override
    public void hasCup() {
        System.out.println("artDeco coffee table has 6 cups");
    }
}

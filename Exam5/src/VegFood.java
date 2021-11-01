public class VegFood implements Food {
    @Override
    public String prepareFood() {
        return "Weg Food";
    }

    @Override
    public double foodPrce() {
        return 50.0;
    }
}

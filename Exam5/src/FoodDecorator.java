public class FoodDecorator implements Food {

    private Food newFood;

    public FoodDecorator(Food newFood){
        this.newFood = newFood;
    }

    @Override
    public String prepareFood() {
        return this.newFood.prepareFood ();
    }

    @Override
    public double foodPrce() {
        return this.newFood.foodPrce ();
    }
}

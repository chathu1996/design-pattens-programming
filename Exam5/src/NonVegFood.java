public class NonVegFood extends FoodDecorator {

    public NonVegFood(Food newFood) {
        super (newFood);
    }

    public String prepareFood(){
        return super.prepareFood () + "With Roasted Chiken and Chiken Curry ";
    }

    public double foodprice(){
        return super.foodPrce () + 150.0;
    }
}

public class ChaineesFood extends FoodDecorator {
    public ChaineesFood(Food newFood) {
        super (newFood);
    }

    public String prepareFood() {
        return super.prepareFood () + " With Fried Rice and Manchurian  ";
    }

    public double foodPrice(){
        return super.foodPrce () + 65.0;
    }
}

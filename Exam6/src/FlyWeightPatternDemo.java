import javafx.stage.Stage;

import java.util.regex.Matcher;

public class FlyWeightPatternDemo {
    private static final String color[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for (int i=0; i<= 20; ++i){
            Circle circle = (Circle) ShapeFactory.getCircle (getRandomColor ());
            circle.setX (getRandomX ());
            circle.setY (getRandomY ());
        }
    }

    private static String getRandomColor() {
        return color[(int)(Math.random ()*color.length)];
    }

    private static int getRandomX(){
        return (int) (Math.random ()*100);
    }

    private static int getRandomY(){
        return (int) (Math.random ()*100);
    }
}

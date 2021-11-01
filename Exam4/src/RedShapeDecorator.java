public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decorateShape) {
        super (decorateShape);
    }

    public void draw() {
        decorateShape.draw ();
        setRedBorder ();
    }

    public void setRedBorder() {
        System.out.println ("Border Color: Red");
    }
}

package problems.d;

// Adapted from example at http://www.oodesign.com
public class ShapeDrawer {

    public void drawShape(Shape shape) {
        if(shape instanceof Circle){
            drawCircle();
        } else if(shape instanceof Square){
            drawSquare();
        }
    }

    private void drawSquare() {
        // Code to draw square
    }

    private void drawCircle() {
        // Code to draw circle
    }
}

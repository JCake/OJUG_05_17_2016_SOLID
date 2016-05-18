package solutions.d;

// Adapted from example at http://www.oodesign.com
/**
 * Open-Closed Principle
 * Code should be open for extension, but closed for modification.
 * Making a change in one spot should not require significant change elsewhere.
 */
public class ShapeDrawer {

    public void drawShape(Shape shape) {
        shape.draw();
    }

}

package solutions.a;

/**
 * DRY - Don't Repeat Yourself
 * Separate methods and classes can be used to avoid code duplication
 */
public class Mover {

    void transformPoint(int x, int y, int z, int magnitude){
        x = transformCoordinate(x, magnitude);
        y = transformCoordinate(y, magnitude);
        z = transformCoordinate(z, magnitude);
    }

    private int transformCoordinate(int coord, int magnitude) {
        return 7 + coord * magnitude;
    }
}

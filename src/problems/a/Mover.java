package problems.a;

public class Mover {

    void transformPoint(int x, int y, int z, int magnitude){
        x = 7 + x * magnitude;
        y = 7 + y * magnitude;
        z = 7 + z * magnitude;
    }
}

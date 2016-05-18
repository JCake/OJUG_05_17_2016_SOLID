package problems.f;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Doing all of your work super fast!");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots do not eat");
    }
}

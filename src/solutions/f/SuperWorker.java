package solutions.f;

public class SuperWorker implements Worker, Feedable {

    public void work() {
        System.out.println("Doing more work");
    }

    @Override
    public void eat() {
        System.out.println("Eating lunch at desk");
    }
}

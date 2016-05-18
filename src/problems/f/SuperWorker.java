package problems.f;

public class SuperWorker implements Worker {

    public void work() {
        System.out.println("Doing more work");
    }

    @Override
    public void eat() {
        System.out.println("Eating lunch at desk");
    }
}

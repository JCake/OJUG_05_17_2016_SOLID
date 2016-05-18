package problems.f;


public class StandardWorker implements Worker {

    public void work() {
        System.out.println("StandardWorker does standard work");
    }

    @Override
    public void eat() {
        System.out.println("Eating lunch with friends!");
    }
}

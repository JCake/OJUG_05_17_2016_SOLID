package solutions.f;


public class StandardWorker implements Worker, Feedable {

    public void work() {
        System.out.println("StandardWorker does standard work");
    }

    @Override
    public void eat() {
        System.out.println("Eating lunch with friends!");
    }
}

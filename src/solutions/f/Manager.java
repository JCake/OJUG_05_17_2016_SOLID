package solutions.f;

// Adapted from example at http://www.oodesign.com
/**
 * Interface Segregation Principle
 * Keep interfaces small, don't put unrelated methods in the same interface
 */
public class Manager {

    void manageWorker(Worker worker) {
        worker.work();
    }

}

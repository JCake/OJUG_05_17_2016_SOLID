package solutions.e;

// Adapted from example at http://www.oodesign.com
/**
 * Dependency Inversion Principle or IOC (inversion of control)
 * Code to interfaces, not to specific implementations
 */
public class Manager {

    void manageWorker(Worker worker) {
        worker.work();
    }

}

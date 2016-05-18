package solutions.b;

import java.util.List;

/**
 * Created by jcake on 5/14/2016.
 */
public class CombinationNamesOutputer implements NamesOutputer {

    private List<NamesOutputer> otherOutputers;

    CombinationNamesOutputer(List<NamesOutputer> otherOutputers){
        this.otherOutputers = otherOutputers;
    }

    @Override
    public void outputNames(List<String> names) {
        this.otherOutputers.forEach((outputer) -> {
           outputer.outputNames(names);
        });
    }
}

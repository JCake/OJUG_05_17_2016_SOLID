package solutions.b;

import java.util.List;

/**
 * Created by jcake on 5/14/2016.
 */
public class SystemOutNamesOutputer implements NamesOutputer {
    @Override
    public void outputNames(List<String> names) {
        System.out.println(names);
    }
}

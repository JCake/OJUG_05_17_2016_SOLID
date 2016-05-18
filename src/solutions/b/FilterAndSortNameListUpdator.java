package solutions.b;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSortNameListUpdator implements NameListUpdator {


    @Override
    public List<String> updateNames(List<String> names) {
        return names.stream().filter((name) -> {
            return !name.startsWith("J") && !name.startsWith("K");
        }).sorted().collect(Collectors.toList());
    }
}

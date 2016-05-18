package solutions.b;

public class ProcessRunner {

    public static void main(String[] args){
        Processor processor = new Processor(
                new FileNamesRetriever("input.txt"),
                new FilterAndSortNameListUpdator(),
                //new FileNamesOutputer("output.txt"));
                new SystemOutNamesOutputer());
        processor.process();
    }
}

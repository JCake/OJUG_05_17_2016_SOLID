package solutions.b;

import java.util.List;

/**
 * SRP - Single Responsibility Principle
 * Each method and/or class should do only one thing.
 */
public class Processor {

    private NamesRetriever namesRetriever;
    private NameListUpdator namesUpdator;
    private NamesOutputer namesOutputer;

    public Processor(NamesRetriever namesRetriever, NameListUpdator namesUpdator, NamesOutputer namesOutputer){

        this.namesRetriever = namesRetriever;
        this.namesUpdator = namesUpdator;
        this.namesOutputer = namesOutputer;
    }

    public void process() {

        List<String> names = this.namesRetriever.retriveNames();
        List<String> updatedNames = this.namesUpdator.updateNames(names);
        this.namesOutputer.outputNames(updatedNames);
    }
}

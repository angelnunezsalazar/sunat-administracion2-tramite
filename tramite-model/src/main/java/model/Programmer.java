package model;

import org.apache.commons.collections.list.GrowthList;

public class Programmer {
    private final String name;

    public Programmer(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}

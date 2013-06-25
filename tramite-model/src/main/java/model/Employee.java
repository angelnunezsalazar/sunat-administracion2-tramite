package model;

import org.apache.commons.collections.list.GrowthList;

public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}

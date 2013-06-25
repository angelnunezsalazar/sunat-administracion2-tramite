package model;

import model.Employee;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void canConstructAPersonWithAName() {
        Employee person = new Employee("Larry");
        assertEquals("Larry", person.getName());
    }
}

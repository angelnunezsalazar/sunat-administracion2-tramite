package model;

import model.Programmer;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void canConstructAPersonWithAName() {
        Programmer person = new Programmer("Larry");
        assertEquals("Larry", person.getName());
    }
}

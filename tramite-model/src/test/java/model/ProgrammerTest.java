package model;

import model.Programmer;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProgrammerTest {
    @Test
    public void shouldConstructAPersonWithAName() {
        Programmer person = new Programmer("Larry");
        assertEquals("Larry", person.getName());
    }
}

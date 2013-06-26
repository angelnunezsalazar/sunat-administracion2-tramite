package services;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProgrammerServiceTest {
    @Test
    public void shouldSayHi() {
        String message = new ProgrammerService().SayHi("Larry");
        assertEquals("Hi, I'm a programmer and my name is Larry", message);
    }
}

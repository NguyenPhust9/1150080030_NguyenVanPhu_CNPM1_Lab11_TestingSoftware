package demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AirthematicTest {

    private String message = "Fpoly exception";
    private JUnitMessage junitMessage = new JUnitMessage(message);

    @Test(expected = ArithmeticException.class)
    public void testJunitMessageException() {
        junitMessage.printMessage();
    }

    @Test
    public void testJunitHiMessage() {
        assertEquals("Hi!Fpoly exception", junitMessage.printHiMessage());
    }
}

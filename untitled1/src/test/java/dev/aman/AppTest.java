package dev.aman;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    @Test
    public void testApp()
    {

        String input = "my name is vikas";
        String output = "sakiv si eman ym";
        String actual = App.reverseLetterWise(input);

        assertEquals(output, actual);
    }
}

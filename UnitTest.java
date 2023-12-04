

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class UnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UnitTest
{
    /**
     * Default constructor for test class UnitTest
     */
    public UnitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void compare()
    {
        ClockTime clockTim1 = new ClockTime(12, 01, 01);
        ClockTime clockTim2 = new ClockTime(12, 01, 01);
        assertEquals(clockTim2, clockTim1.equals(clockTim1));
    }

    @Test
    public void difTimes()
    {
        ClockTime clockTim1 = new ClockTime(12, 01, 01);
        ClockTime clockTim2 = new ClockTime(11, 01, 01);
        assertEquals(clockTim1, clockTim1.equals(clockTim2));
    }

    @Test
    public void compare3()
    {
        ClockTime clockTim1 = new ClockTime(12, 01, 01);
        ClockTime clockTim2 = new ClockTime(12, 12, 12);
        assertEquals(clockTim1, clockTim1.equals(clockTim2));
    }
}




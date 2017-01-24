package BanqueP;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BanqueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BanqueTest
{
    /**
     * Default constructor for test class BanqueTest
     */
    public BanqueTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testChangerNomBanque()
    {
        Agence banque1 = new Agence(250, "SGP",  "75 Paris",null);
        banque1.changerNomBanque("ParisBas");
    }
}


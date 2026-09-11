package com.exemple;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        App calculatrice = new App();
        
        // On vérifie que 2 + 3 donne bien 5
        int resultat = calculatrice.add(2, 3);
        
        // La syntaxe de JUnit 4 pour assertEquals : (messageOptionnel, attendu, reel)
        assertEquals("L'addition de 2 et 3 doit retourner 5", 5, resultat);
    }
    

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

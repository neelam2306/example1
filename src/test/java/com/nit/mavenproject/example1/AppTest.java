package com.nit.mavenproject.example1;

import static org.testng.Assert.assertTrue;

import org.testng.TestNG;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestNG
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

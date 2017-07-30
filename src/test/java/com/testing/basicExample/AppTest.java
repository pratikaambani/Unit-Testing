package com.testing.basicExample;

import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by AmbaniP on 30/07/2017.
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
        super( testName );
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

    public void testFindMax(){
        assertEquals(78, FindMax.findMax(new int[]{1, 23, 4, 45, 78, 5} ));
        assertEquals(8, FindMax.findMax(new int[]{1, -23, +4, -45, -78, 8} ));
    }
}
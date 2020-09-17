package fr.dauphine.ja.bourgsebastien.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void test0IsPrime() {
    	PrimeCollection o = new PrimeCollection();
    	assertFalse( o.isPrime(0) );
    }
    
    public void testTwoIsPrime() {
    	PrimeCollection o = new PrimeCollection();
    	assertTrue( o.isPrime(2) );
    }
    
    public void test9IsPrime() {
    	PrimeCollection o = new PrimeCollection();
    	assertFalse( o.isPrime(9) );
    }
}

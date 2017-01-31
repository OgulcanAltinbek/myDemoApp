package com.mycompany.app;
import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.Arrays;

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
      public void testDogru() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      int result = 0;
      App app = new App();
      result = app.toplam(array,0,1);
      int gerceksonuc = 3;
      assertTrue(result == gerceksonuc);
    }
      public void testYanlis() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      int result = 0;
      App app = new App();
      result = app.toplam(array,0,1);
      int gerceksonuc = 3;
      assertFalse(result != gerceksonuc);
    }
     public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      App app = new App();
      int result = app.toplam(array,1,2);
      assertTrue(result == 0);
    }
    public void testNegative() { 
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      App app = new App();
      int result = app.toplam(array,-1,0);
      assertFalse(result != 0);
     
    } 
} 
    


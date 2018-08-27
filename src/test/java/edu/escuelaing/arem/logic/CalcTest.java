/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.logic;

import edu.escuelaing.arem.logic.LinkedList;
import edu.escuelaing.arem.logic.StatisCalcs;
import java.io.IOException;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author 2099190
 */
public class CalcTest extends TestCase {
    
    public CalcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }



    /**
     * Test of media method, of class App.
     * Test #1
     * Tests the result of the mean in column 1 from Table 1
     */
    @Test
    public void testColumn1Mean() throws IOException{
        double expectedMean = 550.60;
        double actualMean = 0.0;
        String input = "160 591 114 229 230 270 128 1657 624 1503";
        
        StatisCalcs c1m_test = new StatisCalcs();
        LinkedList col = c1m_test.col;               
        c1m_test.readInput(input);
        
        actualMean = c1m_test.media(col);
        assertEquals(expectedMean, actualMean);        
        //Reinicia Linked List y la deja vacia para siguientes tests
        col.clear();        
    }

    /**
     * Test of desEstandar method, of class App.
     * Test #2
     * Tests the result of the standard deviation in column 1 from Table 1
     */
    @Test
    public void testColumn1StdDeviation() throws IOException {
        double expectedStdDeviation = 572.03;
        double actualStdDeviation = 0.0;
        String input = "160 591 114 229 230 270 128 1657 624 1503";
        
        StatisCalcs c1s_test = new StatisCalcs();        
        LinkedList col = c1s_test.col;
        c1s_test.readInput(input);        
        
        actualStdDeviation = c1s_test.desEstandar(col);
        assertEquals(expectedStdDeviation, actualStdDeviation);
        //Reinicia Linked List y la deja vacia para siguientes tests
        col.clear();
    }
    
    /**
     * Test of media method, of class App.
     * Test #3
     * Tests the result of the mean in column 2 from Table 1
     */
    @Test
    public void testColumn2Mean() throws IOException{
        double expectedMean = 60.32;
        double actualMean = 0.0;
        String input = "15.0 69.9 6.5 22.4 28.4 65.9 19.4 198.7 38.8 138.2";
        
        StatisCalcs c2m_test = new StatisCalcs(); 
        LinkedList col = c2m_test.col;
        c2m_test.readInput(input);
        
        actualMean = c2m_test.media(col);
        assertEquals(expectedMean, actualMean);        
        //Reinicia Linked List y la deja vacia para siguientes tests
        col.clear();  
    }

    /**
     * Test of desEstandar method, of class App.
     * Test #2
     * Tests the result of the standard deviation in column 1 from Table 1
     */
    @Test
    public void testColumn2StdDeviation() throws IOException {
        double expectedStdDeviation = 62.26;
        double actualStdDeviation = 0.0;
        String input = "15.0 69.9 6.5 22.4 28.4 65.9 19.4 198.7 38.8 138.2";
        
        StatisCalcs c2s_test = new StatisCalcs(); 
        LinkedList col = c2s_test.col;
        c2s_test.readInput(input);        
        
        actualStdDeviation = c2s_test.desEstandar(col);
        assertEquals(expectedStdDeviation, actualStdDeviation);
        //Reinicia Linked List y la deja vacia para siguientes tests
        col.clear();
    }
    
    /**
     * Test of Size method, of class LinkedList.
     * Test #5
     * Tests the length of both columns from Table 1
     */
    @Test
    public void testSize() throws IOException{
        int expectedSizeCol = 10;
        int actualSizeCol = 0;
        String input = "15.0 69.9 6.5 22.4 28.4 65.9 19.4 198.7 38.8 138.2";
        
        StatisCalcs c1s_test = new StatisCalcs();        
        LinkedList col = c1s_test.col;
        c1s_test.readInput(input);
        
        actualSizeCol = c1s_test.col.getSize();
        
        assertEquals(expectedSizeCol, actualSizeCol);        
        //Reinicia Linked List y la deja vacia para siguientes tests
        col.clear();
    }
}

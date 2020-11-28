package sn.groupAGL.testMetier;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import sn.groupAGL.metier.Calculator;

public class CalculatorTest {
    int        tab[] = { 9, -12, 8, -92, 12, -9 };
    Calculator calculator;

    @Before
    public void setUp() throws Exception {

        calculator = new Calculator();
    }

    @Test
    public void testSum() {

        int result = calculator.sum( 2, 2 );
        if ( result != 4 ) {

            Assert.fail();
        }
    }

    @Test
    public void testMinus() {

        Assert.assertEquals( 0, calculator.minus( 2, 2 ) );
    }

    @Test
    public void divide() throws Exception {

        Assert.assertEquals( 3, calculator.divide( 6, 2 ) );
    }

    @Test
    public void testMultiply() {

        Assert.assertEquals( 12, calculator.multiply( 4, 3 ) );
    }

    /*
     * Veuillez ajouter vos testes ci-dessous
     */
    @Test
    public void testMin() {
        Assert.assertEquals( 3, calculator.min( 3, 4 ) );
    }

    @Test
    public void testMax() {
        Assert.assertEquals( 4, calculator.max( 3, 4 ) );
    }

    /*
     * Tet=st de maxElement et minElement
     */

    @Test
    public void testMaxElement() {

        Assert.assertEquals( 12, calculator.maxElement( tab ) );
    }

    @Test
    public void testMinElement() {
        Assert.assertEquals( -92, calculator.minElement( tab ) );
    }

}

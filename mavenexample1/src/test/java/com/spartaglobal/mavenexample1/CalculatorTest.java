package com.spartaglobal.mavenexample1;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();
    @Test
    public  void testAddition(){
        Assert.assertEquals(4,calculator.add(2,2));
    }
    @Test
    public void testSubtract(){
        Assert.assertEquals(1, calculator.subtract(3,2));
    }

    @Test
    public void testMultiply (){
        Assert.assertEquals(4, calculator.multiply(2,2));
    }
}

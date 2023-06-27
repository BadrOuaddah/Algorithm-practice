package com.badr.algorithm;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaExceptionHandlingTest {
    MyCalculator myCalculator = new MyCalculator();

    @Test
    public void testExceptionWhenNumberIsPositive() throws Exception {
        myCalculator.power(1,2);
    }
    @Test(expected = Exception.class)
    public void testExceptionWhenNumberIsNegative() throws Exception {
        myCalculator.power(-1,2);
    }
    @Test
    public void testExceptionWithAssertThrows(){
        assertThrows(Exception.class,() -> myCalculator.power(-1,2));
    }
}
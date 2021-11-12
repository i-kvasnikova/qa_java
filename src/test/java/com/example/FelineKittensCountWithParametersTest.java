package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineKittensCountWithParametersTest {
    private final int passedNumber;
    private final int expectedNumber;

    public FelineKittensCountWithParametersTest(int passedNumber, int expectedNumber) {
        this.passedNumber = passedNumber;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters
    public static Object[] getCountData() {
        return new Object[][] {
                { 1, 1 },
                { 0, 0 },
                { 11, 11 }
        };
    }

    @Test
    public void getKittensReturnsPassedValue() {
        Feline feline = new Feline();
        int actualNumber = feline.getKittens(passedNumber);
        assertEquals(expectedNumber, actualNumber);
    }
}

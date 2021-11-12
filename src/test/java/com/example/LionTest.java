package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void lionConstructorPassInvalidSexValueThrowsCorrectExceptionMessage() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void getKittensReturnsDefaultValue() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualNumber = lion.getKittens();
        Mockito.verify(feline).getKittens();
        assertEquals(1, actualNumber);
    }

    @Test
    public void getFoodShouldReturnPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
        assertEquals(expectedFood, actualFood);
    }
}
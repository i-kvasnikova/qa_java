package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void shouldEatMeatLikePredatorAnimal() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyShouldReturnFelineName() {
        Feline feline = new Feline();
        String expectedName = "Кошачьи";
        String actualName = feline.getFamily();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getKittensReturnsDefaultValue() {
        Feline feline = new Feline();
        int expectedNumber = 1;
        int actualNumber = feline.getKittens();
        assertEquals(expectedNumber, actualNumber);
    }
}
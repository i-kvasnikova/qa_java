package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    @Mock
    Feline feline;

    @Test
    public void testGetFriends() throws Exception {
        Alex lionAlex = new Alex(feline);
        List<String> actualValue = lionAlex.getFriends();
        assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), actualValue);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Alex lionAlex = new Alex(feline);
        String actualValue = lionAlex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", actualValue);
    }

    @Test
    public void getKittensReturnsZero() throws Exception {
        Alex lionAlex = new Alex(feline);
        int actualNumber = lionAlex.getKittens();
        assertEquals(0, actualNumber);
    }
}
package com.example;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionConstructorWithParametersTest {
    @Mock
    Feline feline;

    private final String passedSex;
    private final boolean expectedHasManeValue;

    public LionConstructorWithParametersTest(String passedSex, boolean expectedHasManeValue) {
        this.passedSex = passedSex;
        this.expectedHasManeValue = expectedHasManeValue;
    }

    @Parameterized.Parameters
    public static Object[] getTestData() {
        return new Object[][] {
                { "Самец", true },
                { "Самка", false }
        };
    }

    @Test
    public void lionConstructorPassCorrectSexValueSetsHasMane() throws Exception {
        Lion lion = new Lion(passedSex, feline);
        assertNotNull(lion);
        assertEquals(expectedHasManeValue, lion.hasMane);
    }

    @Test
    public void doesHaveManeSetsAccordingToSex() throws Exception {
        Lion lion = new Lion(passedSex, feline);
        boolean actualHasManeValue = lion.doesHaveMane();
        assertEquals(expectedHasManeValue, actualHasManeValue);
    }
}

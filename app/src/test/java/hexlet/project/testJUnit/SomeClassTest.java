package hexlet.project.testJUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeClassTest {
    @Test
    public void testSum() {
        var expected = 5;
        var actual = SomeClass.getSum(1, 4);
        assertEquals(expected, actual);
    }
}

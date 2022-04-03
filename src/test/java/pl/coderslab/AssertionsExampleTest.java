package pl.coderslab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExampleTest {
    @Test
    public void shouldTeachAssertions() {
        Assertions.assertTrue(2 == 2);
        Assertions.assertFalse(false);
        Assertions.assertEquals(42, 42);
        Assertions.assertEquals(3.14, 3.14, .01);
        boolean myCustomCondition = false;
        if (myCustomCondition) {
            Assertions.fail("this will always fail");
        }
    }
}

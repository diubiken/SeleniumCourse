package pl.coderslab;

import org.junit.jupiter.api.*;

public class JUnitExampleTest {
    @Test
    public void shouldAddTwoIntegers() {
        System.out.println("Test1");
        int actual = 40 + 2;
        Assertions.assertEquals(42, actual, "This is not The Answer");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before All");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("after All");
    }
}


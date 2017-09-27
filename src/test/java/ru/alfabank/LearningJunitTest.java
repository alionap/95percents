package ru.alfabank;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by а on 26.09.2017.
 */
public class LearningJunitTest {
    LearningJunit learningJunit;

    @BeforeClass
    public static void sayHello () {
        System.out.println("HHHHello");
    }
    @Before
    public void setupNewTest() {
        learningJunit = new LearningJunit();
        System.out.println("Hello!");
    }

    @Test
    public void shouldAddTwoPositiveNumbers() {

        Integer sum = learningJunit.sum(15, 15);
        assertEquals(new Integer(31), sum);
    }

    @Test
    public void shouldAddPositiveNumbers() {

        Integer sum = learningJunit.sum(-4, -4);
        if (sum != -8) {
            throw new RuntimeException("неверная сумма");

        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowException(){
        learningJunit.throwException();
    }

    @After
    public void afterTest (){
        System.out.println("пока");
    }

    @AfterClass
    public static void sayBye () {
        System.out.println("Bye");

    }

}
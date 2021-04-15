package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzTest {

    @Test
    @DisplayName("Test3ReturnFizz")
    void run() {
        int testNumber = 3;
        String expected = "Fizz";
        String actual = Fizz.run(testNumber);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test6returnFizz")
    void run1() {
        int testNumber = 6;
        String expected = "Fizz";
        String actual = Fizz.run(testNumber);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test5returnBuzz")
    void run2() {
        int testNumber = 5;
        String expected = "Buzz";
        String actual = Fizz.run(testNumber);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test15returnBuzz")
    void run3() {
        int testNumber = 15;
        String expected = "FizzBuzz";
        String actual = Fizz.run(testNumber);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test101return101")
    void run4() {
        int testNumber = 101;
        String expected = "101";
        String actual = Fizz.run(testNumber);
        assertEquals(expected, actual);
    }
}
package test;
import TypeRectangle.Rectanglee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RectangleTest {
    Rectanglee rectangle = new Rectanglee();

    @Test
    @DisplayName("Test tam giac deu")
    void run() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giac deu";
        String actual = rectangle.TriangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test tam giac deu")
    void run1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giac can";
        String actual = rectangle.TriangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test tam giac thuong")
    void run2() {
        int a = 2;
        int b = 4;
        int c = 5;
        String expected = "tam giac thuong";
        String actual = rectangle.TriangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test ko phai tam giac")
    void run3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "ko phai tam giac";
        String actual = rectangle.TriangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test ko phai tam giac")
    void run4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "ko phai tam giac";
        String actual = rectangle.TriangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test ko phai tam giac")
    void run5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "ko phai tam giac";
        String actual = rectangle.TriangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }
}
package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }
    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);

        assertTrue(result);
    }
    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }
    @Test
    void isPrimeReturnsTrue() {
        assertTrue(CourseToolkit.isPrime(3));
    }
    @Test
    void isPrimeReturnsFalse() {
        assertFalse(CourseToolkit.isPrime(4));
    }
    @Test
    void isPrimeReturnsTrueForTwo() {
        assertTrue(CourseToolkit.isPrime(2));
    }
    @Test
    void isPrimeReturnsFalseForNumbersLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(-5));
    }
    @Test
    void isPalindromeReturnsTrueForPalindrome() {
        assertTrue(CourseToolkit.isPalindrome("avava"));
        assertTrue(CourseToolkit.isPalindrome("brb"));
        assertTrue(CourseToolkit.isPalindrome("c"));
    }
    @Test
    void isPalindromeReturnsFalseForNonPalindrome() {
        assertFalse(CourseToolkit.isPalindrome("cvcvcvgrfhg"));
        assertFalse(CourseToolkit.isPalindrome("ab"));
    }
    @Test
    void isPalindromeThrowsForNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.isPalindrome(null);
        });
    }
    @Test
    void averageReturnsCorrectResultForPositiveNumbers() {
        int[] values = {1, 2, 3, 4, 5};
        double result = CourseToolkit.average(values);
        assertEquals(3.0, result);
    }
    @Test
    void averageReturnsCorrectResultForNegativeNumbers() {
        int[] values = {-1, -2, -3};
        double result = CourseToolkit.average(values);
        assertEquals(-2.0, result);
    }
    @Test
    void averageThrowsForEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.average(new int[]{});
        });
    }

}

package edu.course.lab01;

import java.nio.file.FileAlreadyExistsException;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isPrime(int number) {
        if (number < 2){
            return false;
    }
     for (int divisor = 2; divisor * divisor <= number; divisor = divisor + 1) {
        if (number % divisor == 0) {
            return false;
        }
        }
        return true;
    }
    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("null");
        }
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
    
        return text.equals(reversed);
    }
        

     public static double average(int[] values){
        if (values == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }
        if (values.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int sum = 0;
        for (int value : values) {
            sum = sum + value;
        }

        return (double) sum / values.length;
    }
}

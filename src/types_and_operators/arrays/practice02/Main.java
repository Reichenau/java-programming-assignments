/*
Типы данных и операторы -> Массивы -> Практика 2
Практика #2
Самостоятельно изучите класс java.util.Arrays и приведите пример использования методов:
String toString(...)
int binarySearch(...)
boolean equals(...)
boolean compare(...)
void sort(...)
*/
package types_and_operators.arrays.practice02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 8, 1};

        // --- toString(...) ---
        System.out.println("1. Исходный массив: " + Arrays.toString(numbers));


        // --- sort(...) ---
        Arrays.sort(numbers);
        System.out.println("2. После сортировки: " + Arrays.toString(numbers));

        // --- binarySearch(...) ---
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("3. Число 8 находится под индексом: " + index);

        int notFound = Arrays.binarySearch(numbers, 99);
        System.out.println("   Число 99 не найдено, результат: " + notFound);


        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 3};
        int[] arrC = {1, 2, 4};


        // --- equals(...) ---
        boolean areEqual = Arrays.equals(arrA, arrB);
        System.out.println("\n4. arrA == arrB? " + areEqual);


        // --- compare(...) ---
        int result = Arrays.compare(arrB, arrC);
        System.out.println("5. Сравнение arrB и arrC: " + result);
    }
}
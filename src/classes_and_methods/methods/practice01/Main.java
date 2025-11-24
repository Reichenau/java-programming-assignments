/*
Классы и методы -> Методы -> Практика 1
Практика #1
Приведите примеры использования перегрузки и переопределения методов.
*/
package classes_and_methods.methods.practice01;

// --- Перегрузка ---
// В одном классе много методов с именем print, но разными параметрами
class Printer {

    void print(String text) {
        System.out.println("Печать текста: " + text);
    }

    void print(int number) {
        System.out.println("Печать числа: " + number);
    }

    void print(String text, int number) {
        System.out.println("Оба метода: " + text + " " + number);
    }
}

// --- Переопределение ---
class Animal {
    void voice() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {

    @Override
    void voice() {
        System.out.println("лай");
    }
}

public class Main {
    public static void main(String[] args) {
        // Тест Перегрузки
        System.out.println("--- Перегрузка ---");
        Printer p = new Printer();
        p.print("Привет");
        p.print(100);
        p.print("Количество", 5);

        // Тест Переопределения
        System.out.println("\n--- Переопределение ---");
        Animal genericAnimal = new Animal();
        genericAnimal.voice();

        Animal myDog = new Dog();
        myDog.voice();
    }
}
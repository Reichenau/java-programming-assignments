/*
Классы и методы -> Параметризованные классы -> Практика 2
Практика #2
Приведите примеры использования конструкций <? extends T> и <? super T>.
Объясните, зачем они нужны?
*/
package classes_and_methods.parameterized_classes.practice02;

import java.util.ArrayList;
import java.util.List;

class Animal {
    @Override
    public String toString() { return "Animal"; }
}
class Dog extends Animal {
    @Override
    public String toString() { return "Dog"; }
}

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        // --- <? extends T> - ЧТЕНИЕ ---
        // Мы можем передать List<Dog>
        printAnimals(dogs);

        // --- <? super T> - ЗАПИСЬ ---
        // Мы можем передать List<Animal>, чтобы положить туда Dog
        addDog(animals);
        System.out.println("Список после добавления: " + animals);
    }

    // --- Пример <? extends T> ---
    // Мы не можем добавить туда ничего, кроме null, т.к. не знаем List<Cat> там или List<Dog>
    public static void printAnimals(List<? extends Animal> list) {
        for (Animal a : list) {
            System.out.println("Чтение: " + a);
        }
        // list.add(new Dog()); // Ошибка компиляции!
    }

    // --- Пример <? super T> ---
    // Читать оттуда правильно можно только Object
    public static void addDog(List<? super Dog> list) {
        list.add(new Dog());
        System.out.println("Добавили собаку");
        // Dog d = list.get(0); // Ошибка
    }
}
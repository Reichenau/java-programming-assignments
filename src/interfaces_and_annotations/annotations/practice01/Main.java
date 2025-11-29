/*
Интерфейсы и аннотации -> Аннотации -> Практика 1
Практика #1
Объясните, зачем нужны аннотации @Override, @Deprecated, @SuppressWarnings
и приведите примеры их использования.
*/
package interfaces_and_annotations.annotations.practice01;

import java.util.ArrayList;
import java.util.List;

class Parent {
    public void printText() {
        System.out.println("Родитель");
    }
}

class Child extends Parent {

    // 1. @Override
    // Проверяет, что мы действительно переопределяем метод, а не создаем новый
    // Если я ошибусь в названии (printTex), компилятор выдаст ошибку
    @Override
    public void printText() {
        System.out.println("Ребенок");
    }

    // 2. @Deprecated
    // Помечает метод как "устаревший"
    // Это предупреждение другим разработчикам
    @Deprecated
    public void oldMethod() {
        System.out.println("Этот метод старый");
    }
}

public class Main {
    // 3. @SuppressWarnings
    // В данном случае мы подавляем предупреждение о том, что используем устаревший метод (deprecation)
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child c = new Child();

        c.printText();

        c.oldMethod();

        @SuppressWarnings("rawtypes")
        List list = new ArrayList(); // Предупреждения не будет
    }
}
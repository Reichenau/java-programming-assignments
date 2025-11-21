/*
Типы данных и операторы -> Базовые типы данных и литералы -> Практика 4
Практика #4
Приведите пример использования перегруженного оператора + с объектами типа String и переменными принадлежащим другим типам (объектам и базовым типам).
*/
package types_and_operators.basic_types_and_literals.practice04;

class Person {
    String name = "Daniel";

    @Override
    public String toString() {
        return "Мое имя: " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";
        String res1 = hello + ", " + world + "!";
        System.out.println("1. Строка + Строка: " + res1);


        int age = 18;
        double height = 1.85;

        String res2 = "Возраст: " + age + ", Рост: " + height;
        System.out.println("2. Строка + Примитивы: " + res2);

        Person person1 = new Person();

        String res3 = "У меня есть " + person1;
        System.out.println("3. Строка + Объект: " + res3);

        System.out.println(5 + 10 + " Text"); // 15 Text

        System.out.println("Text " + 5 + 10); // Text 510
    }
}
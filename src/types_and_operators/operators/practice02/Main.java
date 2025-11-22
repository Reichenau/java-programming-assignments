/*
Типы данных и операторы -> Операторы -> Практика 2
Практика #2
Приведите примеры использования оператора instanceof.
Отдельно рассмотрите случай, когда оператор применятся к null-объекту.
*/
package types_and_operators.operators.practice02;

class Person {
}

class Student extends Person {
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты
        Person person = new Person();
        Student student = new Student();
        Person studentAsPerson = new Student();

        System.out.println("--- Проверка на принадлежность к классу ---");

        System.out.println("1. Студент является студентом?: " + (student instanceof Student));

        System.out.println("2. Студент является человеком?:  " + (student instanceof Person));

        System.out.println("3. Человек является студентом?:  " + (person instanceof Student));

        System.out.println("4. Переменная Person (хранящая Student) является Student?: " + (studentAsPerson instanceof Student));


        // Проверка null
        System.out.println("\n--- Проверка null ---");

        String emptyRef = null;
        Student nullStudent = null;

        boolean check1 = emptyRef instanceof String;
        boolean check2 = nullStudent instanceof Student;

        System.out.println("Является ли null строкой (String)?: " + check1);
        System.out.println("Является ли null студентом (Student)?: " + check2);
    }
}
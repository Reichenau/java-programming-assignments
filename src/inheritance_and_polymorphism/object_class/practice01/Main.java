/*
Наследование и полиморфизм -> Класс Object -> Практика 1
Практика #1
Самостоятельно придумайте класс и переопределите для него метод equals().
Каким соглашениям должна следовать реализация этого метода?
     Реализация должна быть:
     1. Рефлексивной: x.equals(x) всегда true
     2. Симметричной: если x.equals(y), то и y.equals(x)
     3. Транзитивной: если x.equals(y) и y.equals(z), то x.equals(z)
     4. Непротиворечивой: повторный вызов возвращает тот же результат
     5. Неравенство null: x.equals(null) всегда false
*/
package inheritance_and_polymorphism.object_class.practice01;

import java.util.Objects;

class User {
    private int id;
    private String login;

    public User(int id, String login) {
        this.id = id;
        this.login = login;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User other = (User) obj;
        return id == other.id && Objects.equals(login, other.login);
    }

}

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Alex");
        User user2 = new User(1, "Alex");
        User user3 = new User(2, "Bob");

        System.out.println("user1 == user2 (ссылки): " + (user1 == user2));
        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.equals(user3): " + user1.equals(user3));
    }
}
/*
Внутренние классы -> Внутренние (inner) классы -> Практика 1
Практика #1
Приведите примеры использования различных спецификаторов доступа для внутренних классов.
*/
package inner_classes.inner_classes_basics.practice01;

class Outer {
    // 1. Public: Доступен всем, кто видит класс Outer
    public class PublicInner {
        public void print() { System.out.println("Public Inner"); }
    }

    // 2. Private: Доступен ТОЛЬКО внутри класса Outer
    // Из Main мы его создать не сможем.
    private class PrivateInner {
        public void print() { System.out.println("Private Inner"); }
    }

    // 3. Protected: Доступен в пакете + наследникам
    protected class ProtectedInner {
        public void print() { System.out.println("Protected Inner"); }
    }

    // Метод внутри Outer, чтобы доказать, что PrivateInner тут доступен
    void testAccess() {
        PrivateInner p = new PrivateInner();
        p.print();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.PublicInner pub = outer.new PublicInner();
        pub.print();

        Outer.ProtectedInner prot = outer.new ProtectedInner();
        prot.print();

        // Попытка создать Private класс
        // Раскомментировать, иначе будет ошибка компиляции

        // Outer.PrivateInner priv = outer.new PrivateInner();
    }
}
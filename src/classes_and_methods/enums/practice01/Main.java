/*
Классы и методы -> Перечисления -> Практика 1
Практика #1
Приведите примеры класса, в котором используется инициализация элементов перечисления.
*/
package classes_and_methods.enums.practice01;

enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Coin myCoin = Coin.QUARTER;

        System.out.println("Монета: " + myCoin);
        System.out.println("Номинал: " + myCoin.getValue() + " центов");

        System.out.println("\n--- Все монеты ---");
        for (Coin c : Coin.values()) {
            System.out.println(c + " стоит " + c.getValue());
        }
    }
}
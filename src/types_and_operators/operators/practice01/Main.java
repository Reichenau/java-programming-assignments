/*
Типы данных и операторы -> Операторы -> Практика 1
Практика #1
Приведите примеры использования всех определенных выше операторов с операндами базовых типов,
а также с операндами типа String.
Для операторов ++ и -- продемонстрируйте префиксную и постфиксную форму записи.
*/
package types_and_operators.operators.practice01;

public class Main {
    public static void main(String[] args) {
        // --- 1. Арифметические операторы (+, -, *, /, %) ---
        int a = 10;
        int b = 3;
        System.out.println("--- Арифметика ---");
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление (целочисленное): " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));


        // --- 2. Инкремент (++) и Декремент (--) [Префикс и Постфикс] ---
        System.out.println("\n--- Инкремент и Декремент ---");
        int x = 5;
        System.out.println("Постфикс (x++): " + x++);
        System.out.println("x стал: " + x);
        System.out.println("Префикс (++x): " + ++x);

        int y = 10;
        System.out.println("Постфикс (y--): " + y--);
        System.out.println("y стал: " + y);
        System.out.println("Префикс (--y): " + --y);


        // --- 3. Операторы сравнения (==, !=, >, <, >=, <=) ---
        System.out.println("\n--- Сравнение ---");
        System.out.println("a == b? " + (a == b)); // false
        System.out.println("a != b? " + (a != b)); // true
        System.out.println("a > b? "  + (a > b));  // true
        System.out.println("a < b? "  + (a < b));  // false


        // --- 4. Логические операторы (&&, ||, !) ---
        System.out.println("\n--- Логические операторы ---");
        boolean t = true;
        boolean f = false;
        System.out.println("AND (&&): " + (t && f)); // false
        System.out.println("OR (||): "  + (t || f)); // true
        System.out.println("NOT (!): "  + (!t));     // false


        // --- 5. Битовые операторы (&, |, ^, ~) и Сдвиги (<<, >>, >>>) ---
        System.out.println("\n--- Битовые операторы ---");
        int m = 5;
        int n = 3;
        System.out.println("Bitwise AND (5 & 3): " + (m & n)); // 1 (0001)
        System.out.println("Bitwise OR (5 | 3): "  + (m | n)); // 7 (0111)
        System.out.println("Bitwise XOR (5 ^ 3): " + (m ^ n)); // 6 (0110)
        System.out.println("Bitwise NOT (~5): "    + (~m));    // -6
        System.out.println("Сдвиг влево (2 << 2): " + (2 << 2)); // 8 (2 * 2^2)


        // --- 6. Тернарный оператор (?:) ---
        System.out.println("\n--- Тернарный оператор ---");
        int age = 18;
        String status = (age >= 18) ? "Взрослый" : "Ребенок";
        System.out.println("Статус: " + status);


        // --- 7. Операторы присваивания (=, +=, -=, *=, /=, %=) ---
        System.out.println("\n--- Присваивание ---");
        int z = 10;
        z += 5;
        System.out.println("z += 5: " + z); // 15
        z *= 2;
        System.out.println("z *= 2: " + z); // 30


        // --- 8. Операторы со строками (+) ---
        System.out.println("\n--- Строки ---");
        String str1 = "Hello";
        String str2 = "World";
        // Конкатенация
        String result = str1 + " " + str2;
        System.out.println("Сложение строк: " + result);

        // Смешанный тип (Строка + Число)
        System.out.println("Строка + int: " + (str1 + " " + a));

        str1 += " 2025";
        System.out.println("Оператор += для строк: " + str1);
    }
}
/*
Строки -> StringBuilder и StringBuffer -> Практика 2
Практика #2
Покажите с помощью каких методов объекты классов String,
StringBuffer и StringBuilder могут быть преобразованы друг в друга.
*/
package strings.stringbuilder_and_stringbuffer.practice02;

public class Main {
    public static void main(String[] args) {
        String str = "Обычная строка";

        // 1. String -> StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String -> Builder: " + sb);


        // 2. String -> StringBuffer
        StringBuffer buffer = new StringBuffer(str);
        System.out.println("String -> Buffer: " + buffer);


        // 3. StringBuilder -> String
        String fromBuilder = sb.toString();
        System.out.println("Builder -> String: " + fromBuilder);


        // 4. StringBuffer -> String
        String fromBuffer = buffer.toString();
        System.out.println("Buffer -> String: " + fromBuffer);


        // 5. StringBuilder <-> StringBuffer
        StringBuffer newBuffer = new StringBuffer(sb);
        System.out.println("Builder -> Buffer: " + newBuffer);
    }
}
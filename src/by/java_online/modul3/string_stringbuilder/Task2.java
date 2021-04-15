package by.java_online.modul3.string_stringbuilder;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {
    public static void main(String[] args) {
        String string = "analogy";
        System.out.println(addSymbol(string));

    }

    private static StringBuilder addSymbol(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                stringBuilder.append("ab");
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder;
    }
}

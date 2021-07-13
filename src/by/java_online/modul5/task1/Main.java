package by.java_online.modul5.task1;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Корневой каталог");
        TextFileLogic logic = new TextFileLogic();

        TextFile java = logic.createTextFile(directory, "java.txt", new StringBuffer("Какой-то интересный текст."));
        logic.addText(java, " Добавим еще текст.");
        View.printDirectory(directory);

        System.out.println();
        System.out.println("Переименуем файл.");
        logic.renameTextFile(java, "C++.txt");
        View.printDirectory(directory);

        System.out.println();
        System.out.println("Удалим файл");
        logic.removeTextFile(directory, "C++.txt");
        View.printDirectory(directory);
    }
}

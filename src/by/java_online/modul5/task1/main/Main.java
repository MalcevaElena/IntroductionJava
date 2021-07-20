package by.java_online.modul5.task1.main;

/* Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

import by.java_online.modul5.task1.show.View;
import by.java_online.modul5.task1.entity.Directory;
import by.java_online.modul5.task1.entity.TextFile;
import by.java_online.modul5.task1.logic.TextFileLogic;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Корневой каталог");
        TextFileLogic logic = new TextFileLogic();

        Directory newFolder = new Directory("Новая папка");
        Directory newFolder2 = new Directory("Новая папка (2)");
        directory.getDirectoryList().add(newFolder);
        directory.getDirectoryList().add(newFolder2);

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

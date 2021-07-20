package by.java_online.modul5.task1.show;

import by.java_online.modul5.task1.entity.Directory;
import by.java_online.modul5.task1.entity.TextFile;

public class View {
    public static void printDirectory(Directory directory) {
        System.out.println("Название директории: " + directory.getName());
        System.out.println("Директория состоит из следующих файлов: ");

        for (Directory d : directory.getDirectoryList()) {
            System.out.println("/" + d.getName());
        }

        for (TextFile textFile : directory.getTextFileList()) {
            System.out.println("Имя файла: " + textFile.getName());
            System.out.println("Текст: " + textFile.getText());
        }
    }
}

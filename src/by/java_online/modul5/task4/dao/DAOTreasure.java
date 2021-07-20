package by.java_online.modul5.task4.dao;

import by.java_online.modul5.task4.bean.Treasure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DAOTreasure {
    private static final String TREASURE_SOURSE = "source\\TreasureList.txt";

    Scanner scanner;

    public void openFile() {
        try {
            scanner = new Scanner(new FileReader(TREASURE_SOURSE));
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }
    }

    public List<Treasure> readFile() {
        List<Treasure> treasureList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            int cost = scanner.nextInt();
            treasureList.add(new Treasure((cost)));
        }
        return treasureList;
    }

    public void closeScanner(){
        scanner.close();
    }
}

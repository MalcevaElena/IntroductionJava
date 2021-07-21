package by.java_online.modul5.task4.dao.impl;

import by.java_online.modul5.task4.bean.Treasure;
import by.java_online.modul5.task4.dao.DAOException;
import by.java_online.modul5.task4.dao.TreasureDAO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTreasureDAO implements TreasureDAO {
    private static final String TREASURE_SOURCE = "\\resources\\TreasureList.txt";

    @Override
    public List<Treasure> readFile() throws DAOException {
        List<Treasure> treasureList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(TREASURE_SOURCE))) {

            while (reader.readLine() != null) {
                String[] line = reader.readLine().split("[\\ =]");
                Treasure treasure = new Treasure(line[1], Integer.parseInt(line[3]));
                treasureList.add(treasure);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
            throw new DAOException(e);
        }
        catch (IOException e){
            System.err.println("Что-то пошло не так.");
            throw new DAOException(e);
        }

        return treasureList;
    }

}

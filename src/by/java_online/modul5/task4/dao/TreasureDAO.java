package by.java_online.modul5.task4.dao;

import by.java_online.modul5.task4.bean.Treasure;

import java.util.List;

public interface TreasureDAO {

    public List<Treasure> readFile() throws DAOException;

}

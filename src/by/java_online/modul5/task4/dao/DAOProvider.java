package by.java_online.modul5.task4.dao;

import by.java_online.modul5.task4.dao.impl.FileTreasureDAO;

public class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();

    private DAOProvider(){

    }

    public static DAOProvider getInstance() {
        return instance;
    }

    private TreasureDAO treasureDAO = new FileTreasureDAO();

    public TreasureDAO getTreasureDAO() {
        return treasureDAO;
    }
}

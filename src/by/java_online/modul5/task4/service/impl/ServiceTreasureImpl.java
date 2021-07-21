package by.java_online.modul5.task4.service.impl;

import by.java_online.modul5.task4.bean.Treasure;
import by.java_online.modul5.task4.dao.DAOException;
import by.java_online.modul5.task4.dao.DAOProvider;
import by.java_online.modul5.task4.dao.TreasureDAO;
import by.java_online.modul5.task4.service.ServiceException;
import by.java_online.modul5.task4.service.TreasureService;

import java.util.ArrayList;
import java.util.List;

public class ServiceTreasureImpl implements TreasureService {

    @Override
    public List<Treasure> getListTreasure () throws ServiceException{
        List<Treasure> treasureList;

        DAOProvider daoProvider = DAOProvider.getInstance();
        TreasureDAO treasureDAO = daoProvider.getTreasureDAO();

        try {
            treasureList = treasureDAO.readFile();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return treasureList;
    }

    @Override
    public Treasure mostExpensive( ) throws ServiceException {
        List<Treasure> treasureList = getListTreasure();
        Treasure treasureExpensive;

        treasureExpensive = treasureList.get(0);
        for (Treasure treasure : treasureList) {
            if (treasure.getCost() > treasureExpensive.getCost()) {
                treasureExpensive = treasure;
            }
        }
        return treasureExpensive;
    }

    @Override
    public int cost(List<Treasure> treasureList) throws ServiceException {
        if (treasureList==null){
            throw new ServiceException("Сокровища украли, пещера пуста!!!");
        }
        int sum = 0;
        for (Treasure treasure : treasureList) {
            sum += treasure.getCost();
        }
        return sum;
    }

    @Override
    public List<Treasure> selectionTreasure(int worth) throws ServiceException {
        List<Treasure> treasureList = getListTreasure();

        if (treasureList==null){
            throw new ServiceException("Сокровища украли, пещера пуста!!!");
        }

        List<Treasure> treasureWorth = new ArrayList<>();

        for (int i = treasureList.size() - 1; i >= 0; i--) {
            int sum = cost(treasureWorth);
            if ((sum + treasureList.get(i).getCost()) <= worth) {
                treasureWorth.add(treasureList.get(i));
            }
        }
        return treasureWorth;
    }
}

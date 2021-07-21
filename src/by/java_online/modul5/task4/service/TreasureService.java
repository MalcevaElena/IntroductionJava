package by.java_online.modul5.task4.service;

import by.java_online.modul5.task4.bean.Treasure;

import java.util.List;

public interface TreasureService {

    public List <Treasure> getListTreasure() throws ServiceException;

    public Treasure mostExpensive() throws ServiceException;

    public int cost(List<Treasure> treasureList) throws ServiceException;

    public List<Treasure> selectionTreasure(int worth) throws ServiceException;
}

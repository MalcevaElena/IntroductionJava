package by.java_online.modul5.task4.dao;

public class DAOException extends Exception {

    private static final long serialVersionUID = 2L;

    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Exception e) {
        super(message, e);
    }

    public DAOException(Exception e) {
        super(e);
    }
}

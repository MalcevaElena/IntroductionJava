package by.java_online.modul5.task5.service;

public class Validator {

    public static boolean isFlowerInputValid(String name, int price) {

        if (("rose".equalsIgnoreCase(name) || "Chrysanthemum".equalsIgnoreCase(name)) && price > 0) {
            return true;
        }

        return false;
    }

    public static boolean isPackInputValid(String name, int price) {

        if (("paper".equalsIgnoreCase(name) || "BOX".equalsIgnoreCase(name)) && price > 0) {
            return true;
        }
        return false;
    }
}

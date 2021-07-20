package by.java_online.modul5.task4.bean;

public class Treasure {

    private static int START_ID = 1;
    private int id;
    private int cost;

    public Treasure() {
        this.id = START_ID++;
    }

    public Treasure(int cost) {
        this.id = START_ID++;
        this.cost = cost;
    }

    public static int getStartId() {
        return START_ID;
    }

    public static void setStartId(int startId) {
        START_ID = startId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Treasure treasure = (Treasure) o;

        if (id != treasure.id) return false;
        return cost == treasure.cost;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "id=" + id +
                ", cost=" + cost +
                '}';
    }
}

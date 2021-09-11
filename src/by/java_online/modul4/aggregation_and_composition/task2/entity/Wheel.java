package by.java_online.modul4.aggregation_and_composition.task2.entity;

import java.io.Serializable;

public class Wheel implements Serializable {
    private int radius = 14;
    private String material = "Литые диски";
    private boolean whole = true;
    private int rotationalSpeed = 0;

    public Wheel() {
    }

    public Wheel(int radius) {
        if (radius < 14 || radius > 20) {
            this.radius = radius;
        } else {
            System.out.println("Данный радиус колес не может быть установлен на данный автомобиль.");
            System.out.print("Или появляется исключение, или предложение об установки колес другого радиуса.");
        }
    }

    public Wheel(int radius, String material) {
        this(radius);
        this.material = material;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isWhole() {
        return whole;
    }

    public void setWhole(boolean whole) {
        this.whole = whole;
    }

    public int getRotationalSpeed() {
        return rotationalSpeed;
    }

    public void setRotationalSpeed(int rotationalSpeed) {
        this.rotationalSpeed = rotationalSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return radius == wheel.radius && whole == wheel.whole && material.equals(wheel.material);
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + radius;
        result = prime * result + material.hashCode();
        result = prime * result + (whole ? 1 : 0);
        result = prime * result + rotationalSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "Wheel { radius = " + radius + ", material = " + material +
                ", whole = " + whole + ", rotationalSpeed = " + rotationalSpeed + " }";
    }
}

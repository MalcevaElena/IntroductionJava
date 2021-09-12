package by.java_online.modul5.task1.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class File implements Serializable {

    @Serial
    private static final long serialVersionUID = 915519951863315168L;

    private String name = ".txt";

    public File() {
    }

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        return Objects.equals(name, file.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "File { name = '" + name + '\'' + '}';
    }
}
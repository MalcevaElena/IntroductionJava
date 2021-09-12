package by.java_online.modul4.aggregation_and_composition.task1.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Word implements Serializable {
    @Serial
    private static final long serialVersionUID = -2648149654376698546L;

    private String value;

    public Word() {
        this.value = " ";
    }

    public Word(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        return Objects.equals(value, word.value);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Word{ value= " + value + " }";
    }
}


package by.java_online.modul4.aggregation_and_composition.task1.entity;

public class Word {
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
        return value.equals(word.value);
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 17;
        result += prime * result + value.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Word{ value= " + value + " }";
    }
}


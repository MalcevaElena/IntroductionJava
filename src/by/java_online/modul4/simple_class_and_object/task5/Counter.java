package by.java_online.modul4.simple_class_and_object.task5;

public class Counter {
    private int counter;

    public Counter() {
        counter = 0;
    }

    public Counter(int number) {
        this.counter = number;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Counter counter1 = (Counter) o;

        return counter == counter1.counter;
    }

    @Override
    public int hashCode() {
        return counter;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counter=" + counter +
                '}';
    }
}

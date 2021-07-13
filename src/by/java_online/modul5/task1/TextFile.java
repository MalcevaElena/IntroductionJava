package by.java_online.modul5.task1;

public class TextFile extends File {

    private StringBuffer text;

    public TextFile() {
    }

    public TextFile(StringBuffer text) {
        this.text = text;
    }

    public TextFile(String name, StringBuffer text) {
        super(name);
        this.text = text;
    }

    public StringBuffer getText() {
        return text;
    }

    public void setText(StringBuffer text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TextFile textFile = (TextFile) o;

        return text != null ? text.equals(textFile.text) : textFile.text == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TextFile { name = " + super.getName() + " text='" + text + '\'' + '}';
    }
}

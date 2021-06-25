package by.java_online.modul4.aggregation_and_composition.task1.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private Sentence header;
    private List<Sentence> body;

    public Text() {
        this.header = new Sentence();
        this.body = new ArrayList<>();
    }

    public Text(Sentence header) {
        this.header = header;
        this.body = new ArrayList<>();
    }

    public Text(Sentence header, List<Sentence> body) {
        this.header = header;
        this.body = body;
    }

    public Sentence getHeader() {
        return header;
    }

    public void setHeader(Sentence header) {
        this.header = header;
    }

    public List<Sentence> getBody() {
        return body;
    }

    public void setBody(List<Sentence> body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(header, text.header) && Objects.equals(body, text.body);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 37 * result + header.hashCode();

        for (int i = 0; i < body.size(); i++) {
            result += 37 * result + body.get(i).hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Text{ header = " + header +", body = " + body +" }";
    }
}

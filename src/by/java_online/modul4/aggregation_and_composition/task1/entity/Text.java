package by.java_online.modul4.aggregation_and_composition.task1.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private List<Sentence> header;
    private List<Sentence> body;

    public Text() {
        this.header = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public List<Sentence> getHeader() {
        return header;
    }

    public void setHeader(List<Sentence> header) {
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
        int prime = 37;
        int result = 17;
        for (Sentence s: header) {
            result += prime * result + s.hashCode();
        }

        for (Sentence sent : body) {
            result += prime * result + sent.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Text{ header = " + header +", body = " + body +" }";
    }
}

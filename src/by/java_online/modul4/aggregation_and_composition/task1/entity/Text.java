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

        if (header != null ? !header.equals(text.header) : text.header != null) return false;
        return body != null ? body.equals(text.body) : text.body == null;
    }

    @Override
    public int hashCode() {
        int result = header != null ? header.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Text{ header = " + header +", body = " + body +" }";
    }
}

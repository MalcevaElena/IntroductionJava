package by.java_online.modul4.aggregation_and_composition.task1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence implements Serializable {
    private List<Word> sentenceList;

    public Sentence() {
        this.sentenceList = new ArrayList<Word>();
    }

    public List<Word> getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(List<Word> sentenceList) {
        this.sentenceList = sentenceList;
    }

    public void add(Word word) {
        sentenceList.add(word);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;

        return Objects.equals(sentenceList, sentence.sentenceList);
    }

    @Override
    public int hashCode() {
        return sentenceList != null ? sentenceList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Sentence { sentenceList = " + sentenceList + " }";
    }
}

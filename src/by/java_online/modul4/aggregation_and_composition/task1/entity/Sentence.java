package by.java_online.modul4.aggregation_and_composition.task1.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> sentenceList;

    public Sentence() {
        this.sentenceList = new ArrayList<>();
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

        return sentenceList != null ? sentenceList.equals(sentence.sentenceList) : sentence.sentenceList == null;
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

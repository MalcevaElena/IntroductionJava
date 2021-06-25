package by.java_online.modul4.aggregation_and_composition.task1.entity;

import java.util.Objects;

public class Sentence {
    private StringBuffer sentenceList;

    public Sentence() {
        this.sentenceList = new StringBuffer();
    }

    public StringBuffer getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(StringBuffer sentenceList) {
        this.sentenceList = sentenceList;
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
        return 37 * sentenceList.hashCode();
    }

    @Override
    public String toString() {
        return "Sentence { sentenceList = " + sentenceList + " }";
    }
}

package by.java_online.modul4.aggregation_and_composition.task1.show;

import by.java_online.modul4.aggregation_and_composition.task1.entity.Sentence;
import by.java_online.modul4.aggregation_and_composition.task1.entity.Text;

public class Show {

    public void printHeader(Text text) {
        for (Sentence s : text.getHeader()) {
            System.out.print(s.getSentenceList() + " ");
        }
    }

    public void printBody(Text text) {
        for (Sentence s : text.getBody()) {
            System.out.print(s.getSentenceList() + " ");
        }
    }
}

package by.java_online.modul4.aggregation_and_composition.task1.show;

import by.java_online.modul4.aggregation_and_composition.task1.entity.Sentence;
import by.java_online.modul4.aggregation_and_composition.task1.entity.Text;
import by.java_online.modul4.aggregation_and_composition.task1.entity.Word;

public class Show {

    public void printHeader(Text text) {
        for (Sentence s : text.getHeader()) {
            for (Word word : s.getSentenceList()) {
                System.out.print(word.getValue());
            }
        }
        System.out.println();
    }

    public void printBody(Text text) {
        for (Sentence s : text.getBody()) {
            for (Word word : s.getSentenceList()) {
                System.out.print(word.getValue());
            }
            System.out.print(" ");
        }
    }
}

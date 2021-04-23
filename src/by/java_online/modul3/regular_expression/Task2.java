package by.java_online.modul3.regular_expression;
/* Напишите анализатор, позволяющий последовательно возвращать
 * содержимое узлов xml-документа и его тип (открывающий тег,
 * закрывающий тег, содержимое тега, тег без тела). Пользоваться
 * готовыми парсерами XML для решения данной задачи нельзя.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";

        String analysis = analyzer(xml);
        System.out.println(analysis);

    }

    public static String analyzer(String str) {

        StringBuilder strBuilder = new StringBuilder();

        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String[] lines = str.split("\n"); // разбиваем xml на строки

        for (String line : lines) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);

            if (mOpen.find()) {
                strBuilder.append(mOpen.group());
                strBuilder.append(" - открывающий тег\n");
            }
            if (mClose.find()) {
                strBuilder.append(mClose.group());
                strBuilder.append(" - закрывающий тег\n");
            }
            if (mBody.find()) {
                strBuilder.append(mBody.group());
                strBuilder.append(" - содержимое тега\n");
            }
            if (mEmpty.find()) {
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - тег без тела\n");
            }
        }
        return strBuilder.toString();
    }
}

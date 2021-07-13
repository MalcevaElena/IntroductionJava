package by.java_online.modul5.task1;

public class TextFileLogic {

    public TextFile createTextFile(Directory directory) {
        TextFile textFile = new TextFile();
        directory.getTextFileList().add(textFile);

        return textFile;
    }

    public TextFile createTextFile(Directory directory, StringBuffer text) {
        TextFile textFile = new TextFile(text);
        directory.getTextFileList().add(textFile);

        return textFile;
    }

    public TextFile createTextFile(Directory directory, String name, StringBuffer text) {
        TextFile textFile = new TextFile(name, text);
        directory.getTextFileList().add(textFile);

        return textFile;
    }

    public void renameTextFile(TextFile textFile, String name) {
        textFile.setName(name);
    }

    public void addText(TextFile textFile, String text) {
        textFile.getText().append(text);
    }

    public void removeTextFile(Directory directory, String name) {
        for (int i = 0; i < directory.getTextFileList().size(); i++) {
            if (directory.getTextFileList().get(i).getName().equals(name)) {
                directory.getTextFileList().remove(i);
            }
        }
    }


}

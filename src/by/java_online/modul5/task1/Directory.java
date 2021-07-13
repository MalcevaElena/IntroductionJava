package by.java_online.modul5.task1;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String name;
    private List<TextFile> textFileList;

    public Directory() {
        textFileList = new ArrayList<>();
    }

    public Directory(String name) {
        this.name = name;
        textFileList = new ArrayList<>();
    }

    public Directory(String name, List<TextFile> textFileList) {
        this.name = name;
        this.textFileList = textFileList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TextFile> getTextFileList() {
        return textFileList;
    }

    public void setTextFileList(List<TextFile> textFileList) {
        this.textFileList = textFileList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Directory directory = (Directory) o;

        if (name != null ? !name.equals(directory.name) : directory.name != null) return false;
        return textFileList != null ? textFileList.equals(directory.textFileList) : directory.textFileList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (textFileList != null ? textFileList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Directory{ " +
                "name='" + name + '\'' +
                ", textFileList=" + textFileList +
                '}';
    }
}

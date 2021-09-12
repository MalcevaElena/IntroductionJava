package by.java_online.modul5.task1.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory implements Serializable {

    @Serial
    private static final long serialVersionUID = 1437774274608642102L;
    
    private String name;
    private List<TextFile> textFileList;
    private List<Directory> directoryList;

    {
        name = "Новая папка";
        textFileList = new ArrayList<TextFile>();
        directoryList = new ArrayList<Directory>();
    }

    public Directory() {
    }

    public Directory(String name) {
        this.name = name;
    }

    public Directory(String name, List<TextFile> textFileList) {
        this.name = name;
        this.textFileList = textFileList;
    }

    public Directory(String name, List<TextFile> textFileList, List<Directory> directoryList) {
        this.name = name;
        this.textFileList = textFileList;
        this.directoryList = directoryList;
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

    public List<Directory> getDirectoryList() {
        return directoryList;
    }

    public void setDirectoryList(List<Directory> directoryList) {
        this.directoryList = directoryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Directory directory = (Directory) o;

        if (!Objects.equals(name, directory.name)) return false;
        if (!Objects.equals(directoryList, directory.directoryList)) return false;
        return Objects.equals(textFileList, directory.textFileList);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (textFileList != null ? textFileList.hashCode() : 0);
        result = 31 * result + (directoryList != null ? directoryList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", textFileList=" + textFileList +
                ", directoryList=" + directoryList +
                '}';
    }
}

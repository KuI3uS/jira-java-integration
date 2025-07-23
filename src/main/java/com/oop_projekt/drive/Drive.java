package main.java.com.oop_projekt.drive;


import main.java.com.oop_projekt.file.File;

public interface Drive{
    void addFile(File file);

    void listFiles();
    File findFile(String fileName);


}

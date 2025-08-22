package main.java.com.java_Chapter_5.checkedException;

import main.java.com.oop_projekt.file.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NamesReades {
    private final String filePath;

    public NamesReades(String filePath) {
        this.filePath = filePath;
    }
    public String getFilePath() {
        Path path = Paths.get(filePath);
        try {
            List<String> lists = Files.readAllLines(path);
            for (String s : lists) {
                System.out.println(s);
            }
        } catch (IOException e){
            System.out.println("IOException is not reading file");
        }
        return "";
    }
}

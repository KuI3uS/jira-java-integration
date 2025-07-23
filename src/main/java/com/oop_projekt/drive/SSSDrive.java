package main.java.com.oop_projekt.drive;



import main.java.com.oop_projekt.file.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SSSDrive implements Drive{

    Map<String, File> files = new HashMap<>();


    @Override
    public void addFile(main.java.com.oop_projekt.file.File file) {
        files.put(file.getName(), file);
    }

    @Override
    public void listFiles() {
        Set<String> fileNames = files.keySet();
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }

    @Override
    public File findFile(String fileName) {
        return files.get(fileName);
    }
}

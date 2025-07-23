package main.java.com.oop_projekt.file.image;

import main.java.com.oop_projekt.file.AbstractFile;
import main.java.com.oop_projekt.file.FileType;

public class AbstractImageFile extends AbstractFile {

    public AbstractImageFile(String name, int size) {
        super(name, size);
    }
    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}

package main.java.com.oop_projekt.file.music;

import main.java.com.oop_projekt.file.AbstractFile;
import main.java.com.oop_projekt.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    protected String bandName;
    protected String title;

    public AbstractMusicFile(String name, int size, String title, String bandName) {
        super(name, size);
        this.title = title;
        this.bandName = bandName;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}

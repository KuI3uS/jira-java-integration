package main.java.com.oop_projekt.file.music;

public class MP3File extends AbstractMusicFile{

    private final int quaity;

    public MP3File(String name, int size, String title, String bandName, int quaity) {
        super(name, size, title, bandName);
        this.quaity = quaity;
    }

    public int getQuaity() {
        return quaity;
    }

    @Override
    public void play() {
        System.out.println("Playing mp3 file ");
    }
}

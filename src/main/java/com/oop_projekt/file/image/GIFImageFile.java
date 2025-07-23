package main.java.com.oop_projekt.file.image;

public class GIFImageFile extends AbstractImageFile{
    private final String name;
    private final int size;

    public GIFImageFile(String name, int size) {
        super(name, size);
        this.name = name;
        this.size = size;
    }

    public void showAnimation(){
        System.out.println("Showing animation GIF");
    }
}

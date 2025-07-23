package main.java.com.oop_projekt;

public class Monitor {
    private final String name;
    private int width;
    private int height;

    public Monitor(String name) {
        this.name = name;

        setHighResolution();
    }

    public void setHighResolution() {
        height = 3940;
        width = 1920;
    }
    public void setLowResolution() {
        width = 800;
        height = 600;
    }
    public String getResolution() {
        return width + "x" + height;
    }
}

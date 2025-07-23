package main.java.com.oop_projekt;

import main.java.com.oop_projekt.drive.Drive;
import main.java.com.oop_projekt.drive.HDDDrive;
import main.java.com.oop_projekt.drive.SSSDrive;
import main.java.com.oop_projekt.file.image.GIFImageFile;
import main.java.com.oop_projekt.file.image.JPGImageFile;
import main.java.com.oop_projekt.file.music.MP3File;
import main.java.com.oop_projekt.usbdevice.MemoryStick;
import main.java.com.oop_projekt.usbdevice.Mouse;

import java.io.File;

public class Main {
    public static void main(String[] args) {

//        hddDrive.addfile(new File("photo.jpg"));
//        hddDrive.listFiles();\

//        computer.addFile(new File("file.txt"));
//        computer.listFiles();

//        Mouse mouse = new Mouse("Mouse");
//        MemoryStick memoryStick = new MemoryStick("Memory Stick");
//
//        computer.addUSBDevice(mouse);
//        computer.addUSBDevice(memoryStick);
//
//        computer.removeUSBDevice(mouse);
//
//        memoryStick.eject();
//        computer.removeUSBDevice(memoryStick);


        MP3File mp3File = new MP3File("audio.mp3", 4000, "Rammstein", "Sonne", 1000);

        GIFImageFile gifImageFile = new GIFImageFile("funnydog.gif", 150);

        JPGImageFile jpgImageFile = new JPGImageFile("holidays.jpg", 400, 100);

        Monitor monitor = new Monitor("Dell");

        Drive sssdrive = new SSSDrive();

        Computer computer = new Computer(monitor, sssdrive);
        computer.addFile(mp3File);
        computer.addFile(gifImageFile);
        computer.addFile(jpgImageFile);

        computer.listFiles();
        System.out.println(mp3File.getSize());
        System.out.println(gifImageFile.getSize());
    }
}

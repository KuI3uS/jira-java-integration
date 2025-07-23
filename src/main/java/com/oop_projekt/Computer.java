package main.java.com.oop_projekt;

import main.java.com.oop_projekt.drive.Drive;
import main.java.com.oop_projekt.file.File;
import main.java.com.oop_projekt.usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer{
    private Monitor monitor;
    private Drive drive;
    private Headphonees headphonees;

    List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphonees getHeadphonees() {
        return headphonees;
    }

    public void setHeadphonees(Headphonees headphonees) {
        this.headphonees = headphonees;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice) {
        boolean usbDeviceFound = usbDevice.isConnected();
        if (usbDeviceFound) {
            usbDevices.add(usbDevice);
        }
    }

    public void removeUSBDevice(USBDevice usbDevice) {
        boolean disconnected = usbDevice.isDisconnected();
        if (!disconnected) {
            System.out.println("UBB device forcefully disconnected");
        }
        usbDevices.remove(usbDevice);
    }

    public void addFile(File file) {
        drive.addFile(file);
    }
    public void listFiles(){
        drive.listFiles();
    }
    public File listFile(String fileName){
        return drive.findFile(fileName);
    }

}

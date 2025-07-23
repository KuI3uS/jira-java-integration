package main.java.com.oop_projekt.usbdevice;

public class Mouse implements USBDevice {
    private final String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public boolean isConnected() {
        System.out.println("Mouse is connected");
        return true;
    }

    @Override
    public boolean isDisconnected() {
        System.out.println("Mouse is disconnected");
        return false;
    }

    @Override
    public String getDeviceName() {
        return name;
    }
}

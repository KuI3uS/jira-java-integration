package main.java.com.oop_projekt.usbdevice;

public interface USBDevice {
    boolean isConnected();
    boolean isDisconnected();
    String getDeviceName();
}

package main.java.com.oop_projekt.usbdevice;

public class MemoryStick implements USBDevice{
    private final String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean isConnected() {
        System.out.println("MemoryStick: isConnected");
        return true;
    }

    @Override
    public boolean isDisconnected() {
        if(ejected){
            System.out.println("MemoryStick: isDisconnected");
            return true;
        } else{
            System.out.println("Pleas eject Memory Stick first");
            return false;
        }
    }

    @Override
    public String getDeviceName() {
        return name;
    }

    public void eject (){
        System.out.println("eject MemoryStick");
        ejected = true;
    }
}

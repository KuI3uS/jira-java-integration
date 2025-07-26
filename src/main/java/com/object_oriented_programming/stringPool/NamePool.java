package main.java.com.object_oriented_programming.stringPool;

public class NamePool {
    public static void main(String[] args) {
        String name = "John Doe";
        String name1 = "John Doe";
        String name2 = new String("John Doe");
        String name3 = name2.intern();

        System.out.println(name == name1);
        System.out.println(name == name3);
    }
}

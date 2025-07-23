package main.java.com.object_oriented_programming.enums;

import javax.swing.plaf.IconUIResource;

public class Main {
    public static void main(String[] args) {
        RequestHandler requestHandler = new RequestHandler();


        StatusCode statusCode = requestHandler.handleRequest();

        System.out.println("Status code: " + statusCode);

        int code = statusCode.getCode();
        System.out.println(code);

    }
}

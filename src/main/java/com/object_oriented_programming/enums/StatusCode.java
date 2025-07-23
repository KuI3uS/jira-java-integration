package main.java.com.object_oriented_programming.enums;

public enum StatusCode {
    NOT_FOUND(400),
    NOT_CREATE(300),
    NOT_MODIFIED(250),
    OK(200);

    private final int code;

    public int getCode() {
        return code;
    }

    StatusCode(int code) {
        this.code = code;
    }
}





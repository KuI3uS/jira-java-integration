package main.java.com.object_oriented_programming.nameAge;

public class User {
    private String name;
    private int age;
    private String password;

    public boolean validatePassword(String input){
        return password.equals(input);
    }


    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }



    public void setAge(int age, String inputPassword) {
        if (validatePassword(inputPassword)){
            if(age < 18){
                System.out.println("You are not allowed to set age under 18.");
            }else {
                this.age = age;
            }
        } else {
            System.out.println("Incorrect password – cannot update age.");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name, String inputPassword) {
        if (validatePassword(inputPassword)){
            this.name = name;
        } else {
            System.out.println("Incorrect password – cannot update name.");
        }
    }
}



package main.java.com.basics;

public class _11_boards {
    public static void main(String[] args) {
        String name1 = "Jakub";
        String name2 = "Marta";
        String name3 = "Amelia";

        String[] guess = new String[3];
        guess = new String[] {name1, name2, name3};

//        for (int i = 0 ; i < guess.length; i++)
//            System.out.println(guess[i]);

        for (String guesst : guess ){
            System.out.println(guesst);
        }
    }
}

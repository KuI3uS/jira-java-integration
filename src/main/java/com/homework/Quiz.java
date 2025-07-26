package main.java.com.homework;

import javax.sound.midi.Patch;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("src/main/java/com/plikiTxt/quiz.txt");
        List<String> quizList = Files.readAllLines(path);

        int points = 0;

        for(String quiz : quizList){
            String [] quizArray = quiz.split(";");
            System.out.println(quizArray[0]);
            System.out.println();
            System.out.println("1. " + quizArray[1]);
            System.out.println("2. " + quizArray[2]);
            System.out.println("3. " + quizArray[3]);
            System.out.println("4. " + quizArray[4]);
            System.out.println();
            System.out.println("Jaka odp wybierasz?");
            int answer = scanner.nextInt();
            if(answer == Integer.parseInt(quizArray[5])){
                System.out.println("to poprawna odpowiedz");
                points++;
            } else {
                System.out.println("błedna odpowiedz");
                int correctAnswer = Integer.parseInt(quizArray[5]);
                System.out.println("poprawna odpowiedz to : " + correctAnswer + " - " + quizArray[correctAnswer] );
            }
            System.out.println();
        }
        System.out.println("ptoja liczba puntków to : " + points);

    }
}

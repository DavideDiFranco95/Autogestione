package Esercizio03_03_2023;

import java.util.Random;
import java.util.Scanner;

public class Feedback {
    public int id;
    public String title;
    public String text;
    public int vote;

    public void getId(){
        Random rn = new Random();
        id = rn.ints(90000).sum();
    }
    Scanner scanner = new Scanner(System.in);

    public Feedback(){
        getId();
        System.out.println("Insert a Title for your Feedback: ");
        this.title = scanner.nextLine();
        System.out.println("Insert your Text here: ");
        this.text = scanner.nextLine();
        System.out.println("Insert your vote: ");
        this.vote = scanner.nextInt(6);
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", vote=" + vote +
                '}';
    }
}

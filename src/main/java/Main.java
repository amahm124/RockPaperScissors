import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name to play the game!!");
        User user = new User();
        user.setNameInput();
        Game game = new Game(user);

        while (true) {
            System.out.println("pick either rock, paper scissors");
            String choose = scan.nextLine().toUpperCase();


            RPS userChoice = RPS.valueOf(choose);
            game.playerChoose(userChoice);
            game.compChoose();
            RPS comp = game.getCompChoice();
            System.out.println("your opponent has chosen " + comp);
            System.out.println("your turn " + userChoice);
            game.outCome(userChoice, comp);


        }
    }
}
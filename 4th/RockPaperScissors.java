import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String rock = """
            _______
        ---'   ____)
              (_____)
              (_____)
              (____)
        ---.__(___)
        """;

        String paper ="""
            _______
        ---'    ____)____
                    ______)
                   _______)
                 _______)
        ---.__________)
        """;

        String scissors = """
            _______
        ---'   ____)____
                  ______)
              __________)
              (____)
        ---.__(___)

        """;
        String[] gameImages = {rock, paper, scissors};
        System.out.println("Welcome to Rock Paper Scissors");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("What do u want to choose. 0 for rock, 1 for paper, 2 for scissors: ");
        int user_input = sc.nextInt();

        if (user_input >=0 || user_input <3 ) {
            System.out.println(gameImages[user_input]);
        }
        else {
            System.out.println("Invalid input");  
        }

        int computer_ans = random.nextInt(2);
        System.out.println("Computer chose: " + gameImages[computer_ans]);

        if (user_input == 0 && computer_ans == 1){
            System.out.println("Computer Won.");}
        else if (user_input == 0 && computer_ans == 2){
            System.out.println("Player Wins.");}
        else if (user_input == 0 && computer_ans == 0){
            System.out.println("Draw.");}
        else if (user_input == 1 && computer_ans == 0){
            System.out.println("Player Wins.");}
        else if (user_input == 1 && computer_ans == 1){
            System.out.println("Draw.");}
        else if (user_input == 1 && computer_ans == 2){
            System.out.println("Computer Wins.");}
        else if (user_input == 2 && computer_ans == 0){
            System.out.println("Computer Wins");}
        else if (user_input == 2 && computer_ans == 1){
            System.out.println("Player Wins.");}
        else if (user_input == 2 && computer_ans == 2){
            System.out.println("Draw.");}
        sc.close();

    }

        
        

}


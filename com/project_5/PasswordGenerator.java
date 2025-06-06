package project_5;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] letters = {
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] numbers = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] symbols = {
            "!", "#", "$", "%", "&", "(", ")", "*", "+"};


        System.out.println("Welcome to the JavaPassword Generator!.");
        System.out.println("How many letters would you like in your password?");
        int nr_letters = sc.nextInt();
        System.out.println("How many numbers would you like in your password?");
        int nr_symbols = sc.nextInt();
        System.out.println("How many symbols would you like in your password?");
        int nr_numbers = sc.nextInt();

        /*Way 1 (sequential order)

        String password = "";
        for (int i = 0; i<nr_letters; i++) {
            int randomIndex = random.nextInt(letters.length);
            password += letters[randomIndex];
        }

        for (int i = 0; i<nr_numbers; i++) {
            int randomIndex = random.nextInt(numbers.length);
            password += numbers[randomIndex];
        }

        for (int i = 0; i<nr_symbols; i++){
            int randomIndex = random.nextInt(symbols.length);
            password += symbols[randomIndex];
        }
        System.out.println(password);
         */

        //way 2 (random order)

        ArrayList<String> password_list = new ArrayList<>();
        for (int i = 0; i<nr_letters; i++) {
            String randomIndex = letters[random.nextInt(letters.length)];
            password_list.add(randomIndex);
        }

        for (int i = 0; i<nr_numbers; i++) {
            String randomIndex = numbers[random.nextInt(numbers.length)];
            password_list.add(randomIndex);
            
        }

        for (int i = 0; i<nr_symbols; i++){
            String randomIndex = symbols[random.nextInt(symbols.length)];
            password_list.add(randomIndex);
        }

        System.out.println("Unshuffled Password List: " + password_list);
        Collections.shuffle(password_list);
        System.out.println("Shuffled Password List: " + password_list);

        String Password = "";
        for (String ch : password_list) {
            Password += ch;
        }
        System.out.println("Generated Password: " + Password);
        sc.close();





        

    }
    
}

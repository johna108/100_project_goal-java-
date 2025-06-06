package project_1;
import java.util.Scanner;

class BandNameGenerator {
    public static void main(String[] args) {
        System.out.println("welcome to band name generator");
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the city that you grew in: ");
        
        String city_name = sc.nextLine();
        System.out.print("Name of Your first pet: ");
        String Pet_name = sc.nextLine();
        System.out.println("Your new band name is " + city_name +" " + Pet_name);
        sc.close();
        
    
    }
}

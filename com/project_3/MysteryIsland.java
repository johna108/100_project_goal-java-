package project_3;
import java.util.Scanner;

class MysteryIsland {
    public static void main(String[] args) {
        System.out.println("""
                                                    ____
                                         v        _(    )
        _ ^ _                          v         (___(__)
       '_\\V/ `
       ' oX`
          X                            v
          X             -HELP!
          X                                                 .
          X        \\O/                                      |\\
          X.a##a.   M                                       |_\\
       .aa########a.>>                                    __|__
    .a################aa.                                 \\   /
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        """);

        Scanner sc = new Scanner(System.in);
        System.out.println("You woke up at a mysterious island. Find a way to escape.");
        System.out.println("You have two paths, Left and right. The left looks bushy and the right looks muddy.");
        System.out.print("You're to choose between \"Left\" or \"Right\": ");
        String first_choice = sc.nextLine().toLowerCase();

        if (first_choice.equals("left")) {
            System.out.println("You tried to walk on quicksand and died.");
            System.out.println("Game Over.");
        } else if (first_choice.equals("right")) {
            System.out.println("You observe some dangerous looking cannibal tribes coming towards your path.");
            System.out.println("Do you want to run away or hide in the bushes?");
            System.out.print("You're to choose between \"Run\" or \"Hide\": ");
            String sec_choice = sc.nextLine().toLowerCase();

            if (sec_choice.equals("hide")) {
                System.out.println("You've been caught by the cannibals as they noticed you hide.");
                System.out.println("Game Over.");
            } else if (sec_choice.equals("run")) {
                System.out.println("You ran away from the cannibals.");
                System.out.println("As you ran, you see a plane flying over the island and also that there is a boat that is slowly drifting away from the island.");
                System.out.print("You're to choose between \"Boat\" or \"SOS\": ");
                String third_choice = sc.nextLine().toLowerCase();

                if (third_choice.equals("boat")) {
                    System.out.println("You jumped into the boat and escaped from the island.");
                    System.out.println("You Escaped!");
                } else if (third_choice.equals("sos")) {
                    System.out.println("You made a SOS sign but the plane never noticed the SOS and the boat drifted away from the island.");
                    System.out.println("Game Over.");
                } else {
                    System.out.println("Please choose a valid option.");
                }
            } else {
                System.out.println("Please choose a valid option.");
            }
        } else {
            System.out.println("Please choose a valid option.");
        }
        sc.close();
    }
}

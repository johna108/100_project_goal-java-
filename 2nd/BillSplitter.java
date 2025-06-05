import java.util.Scanner;


class BillSplitter {
    public static void main(String[] args) {
        System.out.println("welcome to BillSplitter");
        Scanner sc = new Scanner(System.in);
        System.out.print("What was the final bill amount: ");
        int a = sc.nextInt();
        System.out.print("Number of people: ");
        int b = sc.nextInt();
        int splitter = a/b;
        System.out.println("Each should pay: "+splitter +"$");
        sc.close();

    }
}

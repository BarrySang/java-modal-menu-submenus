import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input = 0;
        while (input != 1 && input != 2) {
            System.out.println("");
            System.out.println("");

            System.out.println("1. Choice one");
            System.out.println("2. Choice two");

            Scanner inputData = new Scanner(System.in);
            System.out.println("Choose an option");
            input = Integer.parseInt(inputData.nextLine());

            System.out.println("");

            if(input == 1) {
                System.out.println("Selected: " +input);
            } else if(input == 2) {
                System.out.println("Selected: " +input);
            } else {
                System.out.println("Ensure you select a valid choice");
            }
            
        }
    }
}
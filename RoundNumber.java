import java.util.Scanner;

public class RoundNumber {
    
    /*
    This project doesn't work as expected, the correct way to determine the answers are mentioned below:

    1. If the answer has 2 digits, the decimal place will be in the center e.g, end result = 37.0, the final answer will be 3.7

    2.If the answer has 3 digits, the decimal place will be 2 digits back e.g, end result = 375.0, the final answer will be 37.5

    3.If the answer has 4 digits, the decimal place will be 3 digits back e.g, end result = 3749.0, the final answer will be 3.749
    
    And you have to apply the same rule to the other DPs (4 and 5).z
    */
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        double num;
        int choice;
        double round = 0.0;
        double ans1;
        float finalans;

        System.out.print("\nEnter the number (float): ");
        num = Sc.nextDouble();

        System.out.println("Select the DP you want to round to:\n1) Nearest 1\n2) 1 Dp\n3) 2 DP\n4) 3 DP\n5) 4 DP");
        choice = Sc.nextInt();

        if (choice == 1) {
            round = 1.0;
        }
        else if (choice == 2) {
            round = 10.0;
        }
        else if (choice == 3) {
            round = 100.0;
        }
        else if (choice == 4) {
            round = 1000.0;
        }
        else if (choice == 5) {
            round = 10000.0;
        }
        else {
            System.out.println("Invalid option!");
        }

        
        finalans = (float) Math.round(num*round);
        System.out.println(finalans);

        Sc.close();

    }
}

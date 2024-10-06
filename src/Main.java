import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Create an instance of the Scanner class to get user input
        Scanner scanner = new Scanner(System.in);

        // Definition of variables
        String name = "Tony Stark";
        String accountType = "Current";
        double balance = 1599.99;
        int option = 0;

        // Main customer data
        System.out.println("********************");
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Account Type: " + accountType);
        System.out.println("Your available balance is: $" + balance);
        System.out.println("\n********************");

        // Menu creation
        String menu = """
                *** Enter the number of the desired option ***
                1 - Check balance
                2 - Withdraw money
                3 - Deposit money
                9 - Exit
                """;

        // Application logic (transactions)
        while (option != 9){
            System.out.println(menu);
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("The updated balance is: $"+ balance);
                    break;
                case 2:
                    System.out.println("How much money do you want to withdraw?");
                    double valueToWithdraw = scanner.nextDouble();
                    if (balance < valueToWithdraw){
                        System.out.println("Insufficient balance");
                    } else{
                        balance = balance - valueToWithdraw;
                        System.out.println("The updated balance is: $"+ balance);
                    }
                    break;
                case 3:
                    System.out.println("How much money do you want to deposit?");
                    double amountToDeposit = scanner.nextDouble();
                    balance += amountToDeposit;
                    System.out.println("The updated balance is: $"+ balance);
                    break;
                case 9:
                    System.out.println("Leaving the program, thank you for using our services.");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
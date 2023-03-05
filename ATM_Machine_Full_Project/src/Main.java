/*
    1. Validate user through ATM Number or Pin.
    2. User should able to perform below operation.
            1.Check available balance
            2.Withdraw amount
            3.Deposit Amount
            4.View Mini Statement
            5.Exit
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        AtmOperationInterface aoi = new AtmOperation_Implementation();
        int atmNumber = 12345;
        int atmPin = 123;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to ATM Machine !!!");
        System.out.println("Enter your ATM number :");
        int atmNo = scan.nextInt();

        System.out.println("Enter your ATM Pin number :");
        int pinNo = scan.nextInt();

        if ((atmNumber == atmNo) && (atmPin == pinNo))
        {
            System.out.println("Validation done!!!");
            while (true)
            {
                System.out.println("1. Available balance \n2.Withdraw Amount \n3.Deposit Amount \n4.View Mini statement \n5.Exit ");
                System.out.println("Please enter your choice");
                int choice = scan.nextInt();

                switch (choice)
                {
                    case 1:
                        aoi.viewBalance();
                        break;
                    case 2:
                        System.out.println("Enter withdrawal amount!!!");
                        double withdrawAmount = scan.nextDouble();
                        aoi.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Enter amount to deposit :");
                        double depositAmount = scan.nextDouble();
                        aoi.depositAmount(depositAmount);
                        break;
                    case 4:
                        aoi.viewMiniStatement();
                        break;
                }
                if (choice == 5)
                {
                    System.out.println("----Please collect your ATM card. \n---Thank You for using ATM Machine!!");
                    break;
                }
                else if (choice > 5)
                {
                    System.out.println("----Please enter the correct number!!!");
                    break;
                }
            }

        }
        else
        {
            System.out.println("Incorrect ATM Number or Pin Number!!!");
            System.exit(0);
        }
    }
}
package st10489559_test_1;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String console = "";
        System.out.println();
        System.out.println("Select the Console type \n1. PS5 \n2.XBOX \n3. SWITCH");
        String input = sc.nextLine();
        int choice = Integer.parseInt(input);
        
        switch (choice) {
            case 1:
                console = "PS5";
                break;

            case 2:
                console = "XBOX";
                
            case 3:
                console = "SWITCH";     
        
            default:
                System.err.println("Invalid input detected");
                break;
        }

        System.out.println("Enter the store:");
        String store = sc.nextLine();

        System.out.println("Enter the total sales of"+ store+": ");
        int sales = sc.nextInt();        

        ConsoleSales consoleSales = new ConsoleSales(console, store, sales);
        consoleSales.printReport();
        
    }

}

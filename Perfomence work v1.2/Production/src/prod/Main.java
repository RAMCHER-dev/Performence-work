package prod;

import prod.Formul;
import prod.Formul2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean refresh = true;
        Scanner scan = new Scanner(System.in);

        while (refresh) {
            System.out.print("Please enter your formula variant, hard or easy (H or E): ");
            String variant = scan.nextLine().trim();

            switch (variant.toUpperCase()) { 
                case "H":
                    Formul2.formul2();
                    break;
                case "E":
                    Formul.formul();
                    break;
                default:
                    System.out.println("Error: Incorrect formula variant!");
                    continue; 
            }

            while (true) { 
                System.out.print("Do you want to repeat this algorithm? (Yes or No): ");
                String choice = scan.nextLine().trim();
                
                if(scan.hasNextLine()) {
                	if (choice.equalsIgnoreCase("No")) {
                		refresh = false;
                    	break; 
                	} else if (choice.equalsIgnoreCase("Yes")) {
                		break; 
                	} else {
                		System.out.println("Error: Incorrect input, please enter Yes or No.");
                	}
                }
            } 
        }

        System.out.println("Algorithm execution finished!");
        scan.close();
    }
}

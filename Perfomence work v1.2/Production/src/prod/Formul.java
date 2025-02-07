package prod;

import java.util.Scanner;

public class Formul {
    public static void formul() {
        double V = 100;
        double T, N, P = 0; 
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of machines or workers involved in the work: ");
        N = scan.nextDouble();

        System.out.print("Enter the time spent working (in hours): ");
        T = scan.nextDouble();

        if (N <= 0 || T <= 0) {
            System.out.println("Invalid value entered, number of machines/workers and time cannot be less than or equal to 0.");
        } else {
            P = (V / (T * N)) * 100;
            if (P > 100) {
                P = 100;
            }
            System.out.printf("Performance: %.2f%%\n", P);
        }
    }
}

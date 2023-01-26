package TS;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);

        calculator.switchOn();
        System.out.println("...Switch On...");
        
       
        calculator.clear();
        System.out.println("Unesite prvi broj");
        int n = in.nextInt();
        calculator.add(n);
                
        System.out.println("Unesite operaciju");
        char o = in.next().charAt(0);
        
        while ( o == '+' || o == '-' ) {
            System.out.println("Unesite novi broj");
            n = in.nextInt();

            if ( o == '+' )
               calculator.add(n);
             else
               calculator.substract(n);
             System.out.println("Rezultat = " + calculator.getResult());
             System.out.println("Unesite operaciju");
             o = in.next().charAt(0);
        }
        
        calculator.switchOff();
        System.out.println("...Switch Off...");
    }
}

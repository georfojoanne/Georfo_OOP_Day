
package Main;

import Encapsulation.encapsulation;
import java.util.Scanner;

public class student {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter test case number: ");
        int choice = scanner.nextInt();
        encapsulation.runEncapsulation(choice);
        
        scanner.close();
                
    }
}


package lab.activity.pkg1;

import java.util.Scanner;
    
public class LabActivity1 {
    
    static Scanner input = new Scanner(System.in);
    static Scanner inputint = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input name: ");
        String name = input.nextLine();
        System.out.println("Age: ");
        int age = inputint.nextInt();
        System.out.println("Gender: ");
        String gender = input.nextLine();
        System.out.println("Address: ");
        String address = input.nextLine();
        System.out.println("Civil Status: ");
        String status = input.nextLine();
        System.out.println("Number of Brothers/Sisters: ");
        int number = inputint.nextInt();
        
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Civil Status: " + status);
        System.out.println("Number of Brothers/Sisters: " + number);
    }
    
}

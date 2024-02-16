package lab_activity1.pkg2;

import java.util.Scanner;

public class Lab_activity12{
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
    
       System.out.println("Enter message: ");
        String message = input.nextLine();
        
        String[] words = message.split("\\s+");
        boolean misplaced = false;
        
        for (String word : words) {

            if (Character.isUpperCase(word.charAt(0))) {

                for (int i = 1; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        misplaced = true;
                        break;
                    }
                }
            }
        }
        
        if (misplaced) {
            System.out.println("Jeje!");
        } else {
            System.out.println("uWu");
        }
        

    }
}
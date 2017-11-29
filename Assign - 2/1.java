package assignment;

import java.util.Scanner;

/**
 *
 * @author Jhumu
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = input.nextInt();
        for(int i=0; i<a;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}
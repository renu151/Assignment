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
        int a , i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = input.nextInt();
            for(i=1; i<=a;i++){
                System.out.print(i);
            }
           System.out.println("");
    }
}
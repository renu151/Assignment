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
        int a , b, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        a = input.nextInt();
        System.out.println("Enter the number of stars: ");
        b = input.nextInt();
        for(i=0; i<a;i++){
            for(j=0; j<b;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
    
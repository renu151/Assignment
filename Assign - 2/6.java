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
        int a , i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        a = input.nextInt();
        for(i=1; i<=a;i++){
            for(j=a; j>=i;j--){
                System.out.print(" ");
            }
           for(j=1; j<=(i*2)-1;j++){
               System.out.print("*");
           }
            System.out.println("");
        }
        for(i=a-1; i>=1;i--){
            for(j=i; j<=a;j++){
                System.out.print(" ");
           }
            for(j=1; j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
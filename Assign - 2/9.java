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
        for(i=0; i<a;i++){
            for(j=a; j>i;j--){
                System.out.print(" ");
            }
            if(i==0 || i==1 || i==a-1){
                for(j=0; j<=i;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(j=0; j<=i-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }    
    }
}
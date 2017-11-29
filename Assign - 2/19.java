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
        System.out.println("Enter the width: ");
        a = input.nextInt();
        System.out.println("Enter the height: ");
        b = input.nextInt();
        for(i=1;i<=b;i++){
            if(i==1 || i==b){
                for(j=1;j<=a;j++){
                    System.out.print(j);
                }
            }else{
                System.out.print(1);
                for(j=1;j<=a-2;j++){
                    System.out.print(" ");
                }
                System.out.print(a);
            }      
            System.out.println("");
        }
    }
}
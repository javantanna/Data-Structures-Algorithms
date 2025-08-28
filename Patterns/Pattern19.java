package Patterns;

/**
 * Pattern19
 *
 * Prints the following pattern when n = 5:
 *
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 */
public class Pattern19 {

    public static void printPattern(int n){

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        printPattern(5);
    }
}
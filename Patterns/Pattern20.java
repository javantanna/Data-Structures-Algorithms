package Patterns;

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

public class Pattern20 {

    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1-1;j<i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1-1;j<i;j++){
                System.out.print("*");
            }            
            System.out.println();
        }
        
    }

    public static void main(String[] args){
        printPattern(5);
    }
}

package Patterns;


//    A
//   ABA
//  ABCBA
// ABCDCBA


public class Pattern17 {
    public static void printPattern(int n){
        char startChar='A';
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)(startChar+j));
            }

            for(int j=i;j>0;j--){
                System.out.print((char)(startChar+j-1));
            }
            System.out.println();

        }
    }

    public static void main(String[] args){
        printPattern(4);
    }
}

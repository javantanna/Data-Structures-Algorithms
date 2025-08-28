package Patterns;

// E
// DE
// CDE
// BCDE
// ABCDE

public class Pattern18 {
    public static void printPattern(int n){
        char lastChar=(char) ('A'+n-1);
        // System.out.println(startChar);
        for(int i=0;i<n;i++){
            char startChar=(char)(lastChar-i);
            for(int j=0;j<=i;j++){
                System.out.print((char) (startChar+j));
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        printPattern(5);
    }
}

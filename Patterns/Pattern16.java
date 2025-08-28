package Patterns;


// A
// BB
// CCC
// DDDD
// EEEEE


public class Pattern16 {
    public static void AlphaTriangle(int n){
        char startChar='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(startChar);

            }
            startChar=(char) (startChar+1);
            System.out.println();
        }
    }

    public static void main(String[] args){
        AlphaTriangle(5);
    }
}

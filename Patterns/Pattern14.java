package Patterns;


// A
// AB
// ABC
// ABCD
// ABCDE

public class Pattern14 {

    public static void alphaTriangle(int n){
        char startChar='A';
        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print((char) (startChar+j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        alphaTriangle(5);
    }
}

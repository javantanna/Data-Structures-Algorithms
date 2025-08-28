package Patterns;


// ABCDE
// ABCD
// ABC
// AB
// A
public class Pattern15 {
    public static void revAlphaTriangle(int n){
        
        for (int i=n;i>=0;i--){
            char startChar='A';
            for(int j=0;j<i;j++){
                System.out.print((char)(startChar+j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        revAlphaTriangle(5);
    }
}

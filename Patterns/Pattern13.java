package Patterns;


// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 


public class Pattern13 {
    public static void floydTriangle(int n){
        int currentNum=1;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(currentNum);
                System.out.print(" ");
                currentNum++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        floydTriangle(5);
    }
}

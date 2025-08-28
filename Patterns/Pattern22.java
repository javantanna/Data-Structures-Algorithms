package Patterns;

// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4 
// 4 3 2 2 2 3 4 
// 4 3 2 1 2 3 4 
// 4 3 2 2 2 3 4 
// 4 3 3 3 3 3 4 
// 4 4 4 4 4 4 4 

public class Pattern22 {
    public static void printPattern(int size){ 
        int n=2* size-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int distFromTop=i;
                int distFromBottom=n-1-i;
                int distFromLeft=j;
                int distFromRight=n-1-j;

                int min=Math.min(Math.min(distFromTop,distFromBottom),Math.min(distFromLeft,distFromRight));
                int numToprint=size-min;
                System.out.print(numToprint+" ");

                
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        printPattern(4);
    }
}

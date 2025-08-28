package Patterns;

// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

class pattern12{
    public static void printPattern(int rows){
        for(int i = 1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);

            }
            System.out.println();

        }
    }

    public static void main(String[] args){
        int rows=5;
        printPattern(rows);
    }
}
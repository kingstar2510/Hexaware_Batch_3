import java.util.Scanner;
public class First{
    public static void main(String[] args){
    //   pattern1(4);
    //   pattern2(5);
    pattern3(5);
    }

    static void pattern1(int n){
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1 ; row <= 5 ; row++){
            for(int col = 1 ; col <= n + 1 -row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n){
        for(int row = 1; row <= n ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
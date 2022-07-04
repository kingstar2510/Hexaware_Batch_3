import java.util.Arrays;
public class Linearmax{
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {5,6,7},
            {2,4,9,11}
        };
        // int[] ans = findmax(arr);
        System.out.println(findmax(arr));
    }

    public static int findmax(int[][] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
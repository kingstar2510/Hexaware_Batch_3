import java.util.Arrays;
public class Select{
    public static void main(String[] args){
        int[] arr = { 2,6,0,1};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void select(int[] arr){
        for(int i = 0 ; i< arr.length ; i++){
            int last = arr.length - i - 1;
            int max = getmax(arr,0,last);
            swap(arr,max,last);
        }
    }

    public static int getmax(int[] arr,int start , int end){
        int max = start;
        for(int i = start ; i <= end ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
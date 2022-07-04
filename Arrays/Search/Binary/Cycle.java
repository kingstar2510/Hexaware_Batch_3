import java.util.Arrays;
public class Cycle{
    public static void main(String[] args){
        int[] arr ={2,1,3,7,4,6,5,8,0};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] ;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
         
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
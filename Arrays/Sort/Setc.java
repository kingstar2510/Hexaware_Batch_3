import java.util.Arrays;
public class Setc{
    public static void main(String[] args){
        int[] arr = { 1,1};
        int[] sol = find(arr);
        System.out.println(Arrays.toString(sol));
    }
     public static int[] find(int[] arr){
        int i = 0;
        while( i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i ,correct);
            }else{
                i++;
            }
        }       

        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index + 1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }

    public static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
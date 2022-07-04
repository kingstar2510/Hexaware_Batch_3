import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Allmissing{
    public static void main(String[] args){
        int[] arr = {4,6,2,1,7};
        List<Integer> sol = new ArrayList<>();
        sol = serch(arr);
        System.out.println(serch(arr));
    }

    public static List<Integer> serch(int[] arr){
        int i = 0 ;
        
        while( i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();

        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index+1){
                ans.add(index + 1);
            }
        }
        return ans;

    } 
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
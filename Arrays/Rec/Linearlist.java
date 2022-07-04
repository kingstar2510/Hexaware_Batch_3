import java.util.ArrayList;
public class Linearlist{
    public static void main(String[] args){
        int[] arr = { 3,5,11,34,11,19,11};
        // find(arr,11,0);
        System.out.println(find(arr,11,0));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> find(int[] arr, int target , int index){
        if( index == arr.length){
            return list ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return find(arr,target,index+1);
    }
}
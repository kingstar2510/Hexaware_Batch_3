import java.util.ArrayList;
public class Arra{
    public static void main(String[] args){
        int[] arr = { 3,1,5,7,1,3,1};
        System.out.println(findall(arr,1,0,new ArrayList<>()));
    }

    static ArrayList<Integer> findall(int[] arr, int target,int index, ArrayList<Integer> list){
        if( index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findall(arr,target,index+1,list);
    }
}
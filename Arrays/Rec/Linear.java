public class Linear{
    public static void main(String[] args){
        int[] arr = {4,2,1,3};
        System.out.println(search(arr,5,0));
    }

    static int search(int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
             return search(arr, target, index + 1);
        }
    }
}
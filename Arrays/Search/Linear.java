public class Linear{
    public static void main(String[] args){
        int[] arr = { 3,5,1,2,7};
        int target = 3;
    System.out.println(find(arr,target));
    }

    static boolean find(int[] arr, int target){
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
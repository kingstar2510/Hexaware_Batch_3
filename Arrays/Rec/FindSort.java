public class FindSort{
    public static void main(String[] args){
        int[] arr = {12,2};
        System.out.println(isSort(arr,0));
    } 

    static boolean isSort(int[] arr ,int n){
         if(  n == arr.length - 1 ){
             return true;
         }
            if(arr[n] < arr[n+1]){
                return isSort(arr,n+1);
            }
            return false;
    }
}
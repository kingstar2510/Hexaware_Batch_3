public class Binay{
    public static void main(String[] args){

        int[] arr = { 2,4,6,12,44};
        System.out.println(serach(arr,44));

    }

    public static int serach(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while( start <= end){
            int mid = start + ( end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
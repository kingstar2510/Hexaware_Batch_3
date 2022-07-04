public class Bin{
    public static void main(String[] args){
        int[] arr = { 1,2,4,5};
        System.out.println(search(arr,2,0,arr.length));
    }

    static int search(int[] arr ,int target , int start, int end){
        // while(start <= end){
            if(start > end){
             return -1;
        }
            int mid = start +( end - start)/ 2;
            if(target < arr[mid]){
                return search(arr,target,start,mid - 1);
            }else if( target > arr[mid]){
                return search(arr,target,mid+1,end);
            }else{
                return mid;
            }
        // }
        
       
    }
}
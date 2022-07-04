public class Maxmin{
    public static void main(String[] args){
        int[] arr = { 2,3,4,5,6,7,88};
        System.out.println(findmax(arr));
    }

    static int findmax(int[] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
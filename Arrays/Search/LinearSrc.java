public class LinearSrc{
    public static void main(String[] args){
        int[][] arr = {
            {3,4,6,1,8},
            {2,68,1,2},
            {3,0,1,22}
        };
        int target = 110;
        System.out.println(find(arr,target));
    }

    public static boolean find(int[][] arr, int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
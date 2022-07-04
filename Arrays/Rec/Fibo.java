// public class Fibo{
//     public static void main(String[] args){
//         int n = 0;
//         System.out.println(fibo(n));
//     }

//     static int fibo(int n){
//         if( n < 2){
//             return n;
//         }

//         int ans = fibo(n-1) + fibo(n-2);
//         return ans;
//     }
// // }
public class Fibo{
    public static void main(String[] args){
        String str = "abc";
        String rev = "";
        for(int i = 0; i< str.length() ;i++){
            char ch = str.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
    }
}
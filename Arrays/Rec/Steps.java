public class Steps{
    public static void main(String[] args){
        System.out.println(step(41));
    }

    static int step(int n){
        return helper(n,0);
    }

    static int helper(int n , int ste){
        if( n == 0){
            return ste;
        }

        if( n % 2 == 0){
            return helper(n/2 , ste + 1);
        }
        return helper(n-1,ste+1);
    }
}
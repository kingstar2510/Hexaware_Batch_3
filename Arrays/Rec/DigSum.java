public class DigSum{
    public static void main(String[] args){
        System.out.println(dig(12));
    }
    static int dig(int n){
        if( n == 0){
            return 0;
        }

        return n%10 + dig(n/10);
    }
}
public class Numb{
    public static void main(String[] args){
        print1(1);
    }

    static void print1(int n){
        if(n > 5){
            return;
        }
        print1(n+1);
        System.out.println(n);
    }

    
}
public class Linearstr{
    public static void main(String[] args){
        String str = "shubham";
        char ch ='u';
        System.out.println(find(str,ch));
    }

    static boolean find(String str, char ch){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}
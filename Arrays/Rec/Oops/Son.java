public class Son extends Parent{
    @Override
    void career(String name){
        System.out.println("I am going to be" + name);
    }   

    @Override
    void partner(String name,int age){
        System.out.println("i love" + name + " it is of" + age);
    }
}
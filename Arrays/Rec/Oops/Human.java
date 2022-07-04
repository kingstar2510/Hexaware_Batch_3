public class Human{

  public static void main(String[] args){
    greeting();
  }

    // public static void main(String[] args){
       int age;
       String name;
       int salary;
       boolean married;
     static int population;

       Human(int age, String name, int salary, boolean married){
           this.age = age;
           this.name = name;
           this.salary = salary;
           this.married = married;
           Human.population += 1;
       }

       static void greeting(){
         System.out.println("hi");
       }

    
}
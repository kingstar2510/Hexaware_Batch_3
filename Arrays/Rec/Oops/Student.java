public class Student{
    int roll = 1;
    String name;
    float marks =  20f;

    public Student(){
        this.marks = 100f;
    }

    public Student(int roll , String name){
        this.roll = roll;
        this.name = name;
    }

    public Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
    }

    void changeName(String name){
        this.name = name;
    }

    void greeting(){
        System.out.println("my name is " + name);
    }
}
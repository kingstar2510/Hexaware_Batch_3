public class Maain{
    public static void main(String[] args){
        Linklist list = new Linklist();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        list.insertLast(4);
        list.display();
        list.insert(22,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        list.insertFirst(3);
        list.insertFirst(19);
        list.display();
        System.out.println(list.delete(2));
        list.display();

    }
}
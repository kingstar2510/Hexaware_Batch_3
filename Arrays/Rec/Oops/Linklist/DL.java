public class DL{
Node head;
Node tail;
int size;

    DL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " ->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("end");

        while( last != null){
            System.out.print(last.value + " <-");
            last = last.prev;
        }
        System.out.println("start");
    }


    public class Node{
        int value;
        Node next;
        Node prev;

        Node(int val){
            this.value = val;
        } 

        Node(int val, Node next , Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
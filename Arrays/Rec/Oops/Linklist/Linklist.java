public class Linklist{
public Node head;
public Node tail;
int size;
public Linklist(){
    this.size  = 0;
}

public void insertFirst(int val){
    Node node = new Node(val);
    node.next = head;
    head = node;

    if(tail == null){
        tail = head;
    }
    size += 1;
}

public int deleteFirst(){
    int val = head.value;
    head = head.next;
    if(head == null){
        tail = null;
    }
    size--;
    return val;
}

public Node getNode(int index){
    Node temp = head;
    for(int i = 0 ; i < index ; i++){
        temp = temp.next;
    }
    return temp;
}

public int deleteLast(){
    if(size <= 1){
       return deleteFirst();
    }
    Node secondLast = getNode(size - 2);
    int val = tail.value;
    tail = secondLast;
    tail.next = null;
    
    return val;
} 

public int delete(int index){
    if( index == 0){
        return deleteFirst();
    }
    if( index == size - 1){
        return deleteLast();
    }

    Node prev = getNode(index - 1);
    int val = prev.next.value;
    prev.next = prev.next.next;
    return val;
}

public void insert(int val, int index){
    if(index == 0){
        insertFirst(val);
        return;
    }
    if(index == size){
        insertLast(val);
        return;
    }

    Node temp = head;
    for(int i = 1; i < index ; i++){
        temp = temp.next;
    }

    Node node = new Node(val,temp.next);
    temp.next = node;
    size++;
}

public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.value + " -> ");
        temp = temp.next;
    }

    System.out.println("end");
}



public void insertLast(int val){
    if(tail == null){
        insertFirst(val);
        return;
    }

    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size++;
}


    public class Node{
        int value;
        Node next;

        public Node(int val){
            this.value = val;
        }

        public Node (int val, Node next){
            this.value = val;
            this.next = next;
        }
    }
}
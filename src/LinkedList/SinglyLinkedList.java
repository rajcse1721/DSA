package LinkedList;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public SinglyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

    //append node
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //Remove last node
    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
}

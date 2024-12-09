class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
        }
}
class MyLinkedList {
private static Node head;
private static Node tail;
    public MyLinkedList() {
         head = null;
         tail = null;
        
    }
    
    public int get(int index) {
        int c=0;
            Node temp = head;
            while(temp!=null){
                if(c==index){
                    return temp.val;
                    
                }
                c++;
                temp=temp.next;
            }
        
        return -1;
        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        
    }
    
    public void addAtTail(int val) {
         Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        
    }
    
public void addAtIndex(int index, int val) {
    if (index < 0) {
        return; // Invalid index
    }

    Node newNode = new Node(val);

    if (index == 0) { // Add at head
        newNode.next = head;
        head = newNode;
        if (tail == null) { // If list was empty
            tail = newNode;
        }
        return;
    }

    Node temp = head;
    for (int i = 0; i < index - 1; i++) {
        if (temp == null) { // Index is out of bounds
            return;
        }
        temp = temp.next;
    }

    if (temp == null) { // Index is out of bounds
        return;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    if (newNode.next == null) { // If new node is the last node
        tail = newNode;
    }
}

    
    public void deleteAtIndex(int index) {
    if (index < 0 || head == null) {
        return; // Invalid index or empty list
    }

    if (index == 0) { // Delete the head node
        head = head.next;
        if (head == null) { // If the list becomes empty
            tail = null;
        }
        return;
    }

    Node temp = head;
    for (int i = 0; i < index - 1; i++) {
        if (temp == null || temp.next == null) { // Index is out of bounds
            return;
        }
        temp = temp.next;
    }

    if (temp.next == null) { // No node to delete
        return;
    }

    temp.next = temp.next.next;

    if (temp.next == null) { // Update tail if the last node was deleted
        tail = temp;
    }
}}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
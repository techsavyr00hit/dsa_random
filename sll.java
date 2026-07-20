import java.util.Scanner;

class sll {

    class node {
        int element;
        node next;

        node(int element) {
            this.element = element;
            this.next = null;
        }
    }

    node head = null;
    node tail = null;
    int counter = 0;

    public node createsll() {
        Scanner sc = new Scanner(System.in);
        int cho = 1;

        while (cho != 0) {
            System.out.print("enter element: ");
            int num = sc.nextInt();
            node newnode = new node(num);
            insertlast(newnode);
            System.out.print("enter 0 to stop: ");
            cho = sc.nextInt();
        }
        return head;
    }
    public node insertlast(node newnode) {
        if (head == null) {
            head = newnode;
            tail = newnode;
        }
        else {
            tail.next = newnode;
            tail = tail.next;
        }
        counter++;
        return head;
    }
    public node insertfirst (node newnode){
        if (head == null) {
            head = newnode;
            tail = newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
        counter++;
        return head;
    }
    node deletefirst() {
        if (head == null)
            return null;
    
        head = head.next;
    
        if (head == null)
            tail = null;
    
        counter--;
        return head;
    }
    node deletelast() {
        if (head == null) {
            return null;
        }
    
        if (head.next == null) {
            head = null;
            tail = null;
            counter--;
            return null;
        }
    
        node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
    
        temp.next = null;
        tail = temp;
        counter--;
        return head;
    }
    int getsize() {
        return counter;
    }
    boolean isempty() {
        if (head == null)
            return true;
        else
            return false;
    }
    int findnode(int val) {
        node temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.element != val) {
                temp = temp.next;
                pos++;
            }
            else {
                return pos;
            }
        }
        return pos;
    }
}
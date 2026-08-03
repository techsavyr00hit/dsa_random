class node {
    int data;
    node next;
    node(int data) {
        this.data = data;
        this.next = null;
    }
}
class stack {
    node top = null;
    int nums;
    void push(int data){
        node entry = new node(data);
        entry.next = top;
        top = entry;
        nums++;
    }
    int pop() {
        if (isempty()){
            System.out.println("stack is empty");
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }
    int peek() {
        if (isempty()) {
            System.out.println("stack is empty");
        }
        return top.data;
    }
    boolean isempty() {
        if (top.next == null) {
            return true;
        }
        else {
            return false;
        }
    }
    int size() {
        return nums;
    }
}

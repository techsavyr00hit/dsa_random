#include <cstdio>
class node {
public:
    int data;
    node *next;
    node(int data) {
        this->data = data;
        this->next = nullptr;
    }
};
class stack {
public:
    node *top = nullptr;
    int nums;
    void push(int data) {
        node *entry = new node(data);
        entry->next = top;
        top = entry;
        nums++;
    }
    int pop() {
        if (isempty()){
            std::cout << "stack is empty" << std::endl;
        }
    }
}

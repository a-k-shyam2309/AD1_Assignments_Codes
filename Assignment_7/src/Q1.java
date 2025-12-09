public class Q1 {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(55);
        s.push(44);
        s.push(66);
        s.push(11);
        s.push(99);
        s.display();
        boolean a = s.isEmpty();
        System.out.println(a);
        boolean b = s.isFull();
        System.out.println(b);
        s.pop();
        s.display();

    }
}

class Stack{
    int arr[] ;
    int top;
    int size;

    Stack(int size){
        this.size = size;
        arr = new int [size];
        top = -1;
    }

    public boolean isFull(){
        return top == size-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("The elements are: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }

    public void push(int val){
        if (isFull()){
            System.out.println("Stack Overflow, can't insert");
            return;
        }
        top = top+1;
        arr[top] = val;
        System.out.println(val + " pushed");
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow, Nothing to pop");
            return;
        }
        System.out.println("The deleted element is: " + arr[top]);
        top--;
        return;
    }

}

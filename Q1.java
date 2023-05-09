
//implementaion of stack with all its methods(push,pop,peek)
class Stack{
    final int N =5;
    int[] Stack = new int[N];
    int top = -1;

    void push(int num){
        if(top == N-1){
            System.out.println("Array is overflowing");
        }else{
            top = top + 1;
            Stack[top] = num;
            System.out.println(num+" pushed into array");
        }
    }

    void pop(){
        int item;
        if(top == -1){
            System.out.println("Array is underflowing");
        }else{
            item = Stack[top] ;
            top = top - 1;
            System.out.println(item+" was deleted succesfully");
            
        }
    }

    void peek(){
        if (top == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("The top item is "+Stack[top]);
        }
    }

    void Display(){
        if(top == -1){
            System.out.println("array is empty");
        }else{
            for(int i = 0; i <= top; i++){
                System.out.print(Stack[i]+" ");
            }
            System.out.println();
        }
    }
}

public class Q1 {

    public static void main(String args[]){
        Stack st = new Stack();
        st.Display();
        st.push(10);
        st.push(5);
        st.push(20);
        st.Display();
        st.peek();
        st.pop();
        st.Display();
        st.pop();
        st.peek();
        st.pop();
        st.Display();

    }
    
}

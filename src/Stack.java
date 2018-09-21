public class Stack
{
    // This class defines an integer stack that can hold 10 values.

        int stack[] = new int[10];
        int tos;
        // Initialize top-of-stack
       public void Stack()
        {
            tos = -1;
        }
        // Push an item onto the stack
        void push(int item)
        {
            if(tos==9)
                System.out.println("Stack is full.");
            else
                stack[++tos] = item;
        }
        // Pop an item from the stack
        int pop() {
            if(tos < 0) {
                System.out.println("Stack underflow.");
                return 0;
            }
            else
                return stack[tos--];
        }
        public void print(){
           for(int i = tos; i>0;i--){
               System.out.println(+stack[i]);
           }
        }
    }





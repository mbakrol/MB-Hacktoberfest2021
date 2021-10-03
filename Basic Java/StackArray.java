//Stack Data structure implementation in java

class StackArray {
    private int maxSize; //size of stack array
    private int[] stackData;
    private int top; //top of stack
    // -------------------------------------------------------------------------
    public StackArray(int s) {
        this.maxSize=s;
        this.stackData=new int[s];
        top=-1;
    }

    public boolean isEmpty() {
        return top==-1;
    }
    public boolean isFull() {
        return top==maxSize-1;
    }

    public void push(int item) {
        if(isFull()){
            System.out.println("The Stack is Full. The insertion cancelled.");
            return;
        }else{
            stackData[++top]=item;
        }
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty, Cannot POP");
        }else{
            return stackData[top--];
        }

    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty, Cannot POP");
        }else {
            return stackData[top];
        }
    }

    public void display() {
        System.out.print("[ ");
        for(int i=top;i>=0;i--){
            System.out.print(stackData[i]+" ,");
        }
        System.out.print("\b\b ] ");
    }
}


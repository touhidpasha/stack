



class Stack{
    public int[] arr;
    public int top ;

    Stack(){
        arr=new int[10];
        top=-1;
    }

    public void push(int x){
        arr[++top]=x;

    }
    public int pop(){
        return(arr[top--]);
    }
    public void printStack(){
        for(int i=top;i>=0;i--)
            System.out.println(arr[i]);
    }

}
public class MainClass{

    public static void main(String args[]){
        Stack s1=new Stack();
        s1.push(5);
        s1.push(7);
        s1.push(9);
        s1.printStack();
        s1.pop();
        s1.printStack();
        
    }
}
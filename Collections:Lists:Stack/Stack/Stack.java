
import java.util.ArrayList;

public class Stack{
    ArrayList<Integer> a = new ArrayList();

    public boolean isEmpty(){
        return a.size()==0;
    }

    public void push(int data){
        a.add(data);
    }

    public int pop(){
        if(isEmpty())
            return -1;
        else
            return a.remove(a.size()-1);
    }

    public int peek(){
        if(isEmpty())
            return -1;
        else   
            return a.get(a.size()-1);
    }

}
import java.util.Stack;

/**
 *
 * @author Ahmed Hady
 */
public class Queue {
   public Stack<Integer>st1 = new Stack(); 
   public Stack<Integer>st2 = new Stack(); 
   static int counter=0;
 
    
      public void inquee(int data) {    
        st1.push(data);    
        counter++;
    }
    
    public int dequee() {    
        int data;
        while (!st1.isEmpty()){ // move elemtns to st2
            st2.push(st1.pop());
        }
        data = st2.pop();       //here i got my element
        while (!st2.isEmpty()){ // get elements back to st1
            st1.push(st2.pop());
        }
        return data;
            
    }
}

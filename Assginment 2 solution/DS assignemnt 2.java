import java.util.Stack;

/**
 *
 * @author Ahmed Hady
 */
public class DS_S_21 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Queue q1 = new Queue();
        q1.inquee(1);                       //q = {1}
        q1.inquee(2);                       //q = {2,1}
        System.out.println(q1.dequee());    //q = {2}
        q1.inquee(3);                       //q = {3,2}
        q1.inquee(4);                       //q = {4,3,2}
        System.out.println(q1.dequee());    //q = {4,3}
        q1.inquee(5);                       //q = {5,4,3}
        System.out.println(q1.dequee());    //q = {5,4}
        System.out.println(q1.dequee());    //q = {5}
        System.out.println(q1.dequee());    //q = {}
    }
 
  
}

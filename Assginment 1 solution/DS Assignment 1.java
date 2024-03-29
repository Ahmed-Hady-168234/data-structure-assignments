import java.util.Scanner;

/**
 *
 * @author Ahmed Hady
 */
public class DS_ass1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number to convert it to binary");
        int value = scan.nextInt();
        String s = dec2Bin(value);
        s = revString(s, s.length());
        System.out.println("the number "+value+" is in binary equal to "+s);
    }
    public static String dec2Bin(int value){                //method to convert from decimal to binary
        if (value == 0) {
            return "";
        }
        return ""+value%2+ dec2Bin(value/2);
    }
    public static String revString(String value,int size){  //method to reverse the String
        if (size==0) {
            return "";
        }
        return "" + value.charAt(size-1)+revString(value,size-1);
    }
    
}

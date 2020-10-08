package Exceptions_labs;

import javax.swing.text.BadLocationException;

public class Exception1 {
    public void boundViolation(){
        int[] myArray = new int[1];
        myArray[0] = myArray[1];
    }
    public static void main(String[] args) {
        try{
            Exception1 myObj = new Exception1();
            myObj.boundViolation();
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Index is out of bound");
        }
    }
}

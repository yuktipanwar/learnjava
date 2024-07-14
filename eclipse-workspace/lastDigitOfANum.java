import java.math.*;

public class lastDigitOfANum {

    static int lastDigit(int n){
        return(n%10);       //return last digit
    }

    public static void main(String args[]){

        int n=98562;
        System.out.println(lastDigit(Math.abs(n)));      //absolute for the cases of -ve numbers. 
    }
    
}

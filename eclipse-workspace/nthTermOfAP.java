import java.io.*;
import java.lang.*;

public class nthTermOfAP {

    public static int Nth_of_AP(int a, int d, int N){
        return (a+(N-1)*d);
    }

    public static void main(String[] args){

        //starting number
        int a=2;

        //Common difference
        int d=1;

        //N th term to be found
        int N=5;

        System.out.print("The "+ N + "th term of the series is: "+ Nth_of_AP(a, d, N));
    }
    
}

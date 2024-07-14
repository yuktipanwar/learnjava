import java.io.*;
import java.lang.*;

public class nthTermOfGP {

    public static int Nth_of_GP(int a, int r, int N){
        return (a*(int)(Math.pow(r, N-1)));
    }

    public static void main(String[] args){

        //starting number
        int a=2;

        //Common difference
        int d=3;

        //N th term to be found
        int N=5;

        System.out.print("The "+ N + "th term of the series is: "+ Nth_of_GP(a, d, N));
    }


    
}

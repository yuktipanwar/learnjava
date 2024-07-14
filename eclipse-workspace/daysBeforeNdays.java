import java.util.Scanner;

public class daysBeforeNdays {

    public static void main(String[] args){

        //String arr[]={"d , n", "0, Sunday", "1, Monday", "2, Tuesday", "3, Wednesday", "4, Thursday", "5, Friday", "6, Friday"};

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of d: ");
        int d= sc.nextInt();
        System.out.println("Enter value of n: ");
        int n= sc.nextInt();

        int x=n%7;

        int ans=d-x;

        if(ans>0){
            System.out.println(ans);
        }
        else{
            System.out.println(ans+7);
        }
    }


    
}

public class leapYear {

    static boolean checkYear(int year){

        //If a year is multiple of 400 or 4
        //then it is a leap year.

        if(year%400==0){
            return true;
        }
        if(year%4==0){
            return true;
        }
        return false;
    }

    public static void main (String[] args){

        int year = 2000;

        System.out.println(checkYear(year)? "Leap Year" : "Not a Leap Year");
    }
    
}

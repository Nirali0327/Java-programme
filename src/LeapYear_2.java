public class LeapYear_2 {
//    // WAP to input for a year 1989 and find out if it is leap year
        public static void findYear(int year)
        {
                if((year % 400 == 0 ) || (year % 4 == 0 ))
                {
                        System.out.println( year + " is a leap year " );
                }
                else if (year % 100 != 0) { // century year
                        System.out.println( year + " is not a leap year " );
                }
        }
        public static void main(String[] args){
                findYear(1900);

        }
}


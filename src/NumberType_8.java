public class NumberType_8 {
    //WAP to input any number and fid our if it is positive , negative or zero
    public static void numericValue(int num){
        if(num>0)
        {
            System.out.println (   "  Number " + num + " is a positive number");
        }
        else if (num < 0)
        {
            System.out.println ( " Number " + num + "  is a negative number ");
        }
        else
        {
            System.out.println(  " Number " + num + " is a Zero");
        }

        }
        public static void main(String[] args) {
        numericValue(-21);
    }
    }


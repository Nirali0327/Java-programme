public class FindValue_14 {
    public static void number (char value ){
        if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z'))
        {
            System.out.println( value + " is a alphabet ");
        } else if (value >= '0' && value <= '9')
        {
            System.out.println(  value +   " is a numeric value");
        } else {
            System.out.println( value +   "  It is a symbol");
        }
    }
    public static void main(String[] args) {
       number('Z');
    }
}


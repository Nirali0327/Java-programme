public class Symbol_13 {
    static int num1 = 50;
    static int num2 = 10;
   public static  void operators(char ch) {
       if (ch == '+') {
           System.out.println("use" + " + " + "addition  operator for num1+num2 = " + (num1+num2));
    }else if (ch == '-'){
        System.out.println("use" + " - " + " subtraction operator for num1-num2 = " + (num1 - num2));
    }else if ( ch == '*'){
        System.out.println("use" + " * " + " multiplication operator for num1*num2 = " + (num1 * num2));
    }else if (ch == '/'){
        System.out.println("use" + " / " + "  division operator  for num1/num2 = " + (num1 /num2));
       }
   }
       public static void main (String[]args){
            operators('-');

       }
   }





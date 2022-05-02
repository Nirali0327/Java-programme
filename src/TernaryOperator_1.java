public class TernaryOperator_1
{ // syntax of ternary operator variable = (condition) ? (expression1) : (expression2);
      public static void number1(int num1,int num2)
       {
           String result1 = (num1 % 2 == 0 ) ?   " even number  " : " odd number"; // Ternary operator
           {
               System.out.println((num1) + " number is " + result1);
           }
           String result2 = (num2 % 2 == 0 ) ? " even number  " : " odd number";  // Ternary operator

            System.out.println((num2) + " number is " + result2);
       }
       public static void main(String[]args)
       {
             number1(19,24);

       }
}

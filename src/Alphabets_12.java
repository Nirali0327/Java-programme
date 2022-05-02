public class Alphabets_12
{
      // Input any alphabet in uppercase and print it in lowercase
    public static void convertLetter(String UpperCase)
    {
        String LowerCase = UpperCase.toLowerCase();// // toLowerCase() is a method of String class to convert any uppercase in to lowercse
        {
           System.out.println(" Convert uppercase Alphabet : " + UpperCase + " to lowercase Alphabet: "+ LowerCase );
       }
   }
   public static void main(String[] args) {
        convertLetter(" Q ");
    }
}


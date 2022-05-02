public class CityName_10 {
    public static void city(char ch){
        if(ch == 'a'|| ch == 'A')
        {
            System.out.println(  " The city name for alphabet " +  ch + " is Ahmedabad ");
        }
          else if (ch == 'b'|| ch == 'B')
       {
          System.out.println( " The city name for alphabet " +  ch + " is Baroda ");

        }  else if (ch == 'c'|| ch == 'C')
        {
            System.out.println( " The city name for alphabet " +  ch + " is Calcutta ");
        } else if (ch == 'd'|| ch == 'D')
        {
            System.out.println( " The city name for alphabet " +  ch + " is  Daman ");
        }
          else if (ch == 'e'|| ch == 'E'){
            System.out.println(" The city name for alphabet " +  ch + " is  Eluru ");
        }
        else if (ch == 'f'|| ch == 'F'){
            System.out.println("  The city name for alphabet " +  ch + " is Firozabad ");
        }
        else
        {
            System.out.println(" Invalid Entry ");
        }
    }

    public static void main(String[] args) {
        city('d');
    }
}

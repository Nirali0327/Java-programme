public class VowelConstant_16 {
    public static void Alphabets(char letter)
    {
        if (letter == 'a'|| letter=='e'||letter=='i'||letter=='o'||letter=='u'|| // lowecase letter
           letter == 'A'|| letter == 'E'||letter=='I'||letter =='O'||letter =='U') // uppper case letter
        {
           System.out.println(letter + " is a vowel alphabet.");
        }
         else
        {
            System.out.println(letter + " is a consonant alphabet.");
        }
    }
     public static void main(String[] args)
    {
        Alphabets('e');
    }

}

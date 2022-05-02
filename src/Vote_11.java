public class Vote_11 {
    public static void voteEligible(int age)
    {
         if(age >= 18)
        {
            System.out.println(" A person is eligible for a vote ");
        }else
        {
            System.out.println("  A person is not eligible for a vote ");
        }
    }

    public static void main(String[] args) {
        voteEligible(17);
    }

}

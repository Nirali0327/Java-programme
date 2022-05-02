public class StudentResult_3 {
    static String studentName = "Nirali";
    static int rollNumber = 23;
    static int maths = 68;  // each subjects marks  are out of 100
    static int science = 95;
    static int english = 92;
    static int totalMarks = maths + science + english;
    static int percentage = totalMarks * 100 / 300;
    public static void studentTotalMarks()
    {
        System.out.println(" Student total marks for all three subjects " + (totalMarks));
    }
    public static void percentageOfTotal()
    {
        System.out.println(" Percentage of student result " + (percentage) + " % ");
    }
    public static void main(String[] args)
    {
        studentTotalMarks();
        percentageOfTotal();
        if (percentage >= 80)
        {
            System.out.println("The student is pass and graded A+");
        } else if (percentage >= 60)
        {
            System.out.println(" The student is pass and graded A");
        } else if (percentage >= 50)
        {
            System.out.println("The student is pass and graded B ");
        } else if (percentage >= 35)
        {
            System.out.println("The student is pass and graded c ");
        } else
        {
            System.out.println("The student is failed.");
        }

    }

}
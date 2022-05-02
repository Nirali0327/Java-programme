public class AverageNumber_7 {
    public static void NumberAverage(int num1, int num2, int num3, int num4, int num5)
    {   int total = num1 + num2 + num3 + num4 + num5; // local variable
        int avg = total / 5;  // local variable
        {
            System.out.println(" Average number  is "  + avg);
        }
    }
    public static void main(String[] args) {
        NumberAverage(20, 30, 40, 50, 10);

    }
}


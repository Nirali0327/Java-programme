public class InterChangeValue_5 {
    //    WAP to input any two numbers and then print their interchanged value
    static int x = 12;
    static int y = 20;
    static int change;
    public static void main(String[] args) {
        System.out.println("Before interchanged the value for x is " + x + " and y is " + y);
        int change = x;
        int x = y;
        int y = change;
        System.out.println("After interchanged the value for x is " + x + " and y is " + y);

    }
}


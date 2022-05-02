public class PassFail_4 {//pass or fails on the basis of..student needs to pass all the subjects
    public static void result(int maths,int science,int english){
        // passing mark for all the subject is 35 out of 100
        if (maths>=35 && science>=35 && english>=35){
            System.out.println("The student has gain above 35 marks for each subject so result is PASS");
        }else
        {
            System.out.println(" The student has gain below 35 marks in one of the subjects so result is FAIL");
        }
    }

    public static void main(String[] args) {
        result(33,78,89);
    }
}

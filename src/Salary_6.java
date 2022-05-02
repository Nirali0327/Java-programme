public class Salary_6 {
  static String name = " Nirali";
  static int id = 23;
  static int basicSalary= 60000;
  public static void salaryCalculation() {
   int HRA = basicSalary*10/100;
    int DA = basicSalary * 8 / 100;
    int TA = basicSalary * 9 / 100;
    int PF = basicSalary * 20 / 100;
    System.out.println("   The HRA allowance 10 % = " + HRA); // HRA
    System.out.println("   The DA allowance 8%   = " +   DA); // DA
    System.out.println("   The TA allowance 9%  = " +  TA);// TA
    System.out.println("   The PF allowance 20%  = " +  PF);// PF
    System.out.println("   The gross salary is   = " + ((basicSalary+ HRA + TA + DA) -PF));
 }
  public static void main(String[] args) {
  salaryCalculation();


  }
  }


public class SalesAmount_9 {
    //WAP input sales id, seller's name, sales amount, salary basic and then find this sales
      static int id;
      static int salary;
    public static void commission(String name,int sales) {
        if (sales >= 50000) {
            System.out.println("The commission is 35% = " + (sales * 35 / 100));
        } else if (sales >= 30000) {
            System.out.println("The commission for this sale is 20% = " + (sales * 20 / 100));
        } else if (sales >= 20000) {
            System.out.println("The commission for this sale is 10% = " + (sales * 10 / 100));
        } else if (sales >= 10000) {
            System.out.println("The commission for this sale is 5% = " + (sales * 5 / 100));
        } else if (sales <= 10000) {
            System.out.println("The commission for this sale is 2% = " + (sales * 2 / 100));
        }

        }
            public static void main (String[]args){
            commission("Nirali", 25000);
        }
        }

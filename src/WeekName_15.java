public class WeekName_15 {//WAP input any number between 1 to 7 the print Day name of the week accordingly by using if else
    public static void nameOfTheWeek(int Day){
        if(Day  ==  1)
        {
            System.out.println("It is Monday today");
        }else if( Day  == 2)
        {
            System.out.println("It is Tuesday today");
        }
       else if (Day == 3)
       {
            System.out.println("It is wednesday today");
        }
       else if (Day == 4)
       {
            System.out.println("It is Thursday today");
        }else if(Day== 5)
        {
            System.out.println("It is Friday today");
        }else if(Day==6)
        {
            System.out.println("It is Saturday today");
        } else if(Day == 7)
        {
               System.out.println(" It is Sunday today");
        }else
                System.out.println("It is invalid number ");
        }

    public static void main(String[] args) {
        nameOfTheWeek(5);
    }
    }

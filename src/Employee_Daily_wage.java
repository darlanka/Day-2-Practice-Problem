import java.util.Random;

public class Employee_Daily_wage {
    String name;
    int hours;
    public  void employ_wage(){
        // wage per house 20 , full day 8
        Random rand = new Random();
        int present = rand.nextInt(2);
        int wagePerHour = 20;
        int full_day = 8;
        if(present == 1){
            System.out.println("Your wage for today is "  + wagePerHour*full_day);
        }
        else{
            System.out.println("you are absent your wage is " + 0);
        }
    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome! to Employee Wage Computation");
        int workingdaypermonth = 20;
        int wage_per_hour =  20;
        int Full_day_hour = 8;
        // assuming the employee is present!
        // so 20 days == 20 * 20hours == 20 * 20 * 8 which is the cost

        int ans = workingdaypermonth*wage_per_hour*Full_day_hour;
        System.out.println("the total wage of the Employee per month is " + ans);
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome! to Employee Wage Computation");
        System.out.println("Enter you name ?");
        Scanner sc = new Scanner(System.in);
        String employee = sc.nextLine();
        System.out.println("Enter you id!");
        int id = sc.nextInt();
        int Full_hour_day = 8;
        int Wage_for_hour = 20;
        int Wage_for_part_time_per_hour = 8;
        // so we need to calculate for the total working hours is reached for a month

        // that is 100 hours and 20 days

        // lets assume we have 31 days in a month
        int total_working_days = 0;
        int total_working_hours_part_time = 0;
        for(int i =0;i < 30;i++) {
            // checking that the employee has over worked or not if
            // he reached his working limit donot allow him to do work
            // as health is wealth
            if (total_working_days > 20 && total_working_hours_part_time > 100) {
                System.out.println("You have reached the limit come again to work for next month!");
                total_working_days = 20; total_working_hours_part_time = 100;
                break;
            } else {
                // checking if employee is present or not
                int attendence = (int) (Math.random() * 2);

                // generating part time hours also
                int part_time_work_per_day = 0;
                // if he is present at that day then how much will time will he work
                if (attendence == 1) {
                    part_time_work_per_day = (int) (Math.random() * 9);
                }
                if (attendence == 1) total_working_days += 1;
                total_working_hours_part_time += part_time_work_per_day;
            }
        }
        // now we have the part time hours and no of days
        // limiting the value so that the worker is able to
        System.out.println("the employee " + employee +" "+ id + " wage info : ");
        System.out.println("total no of days the employee worked are : " + total_working_days);
        System.out.println("total partime hours employee worked :" + total_working_hours_part_time);
        System.out.println("total wage is " + total_working_days*Full_hour_day*Wage_for_hour + total_working_hours_part_time*Wage_for_part_time_per_hour);
    }
}
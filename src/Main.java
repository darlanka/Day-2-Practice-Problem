import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome! to Employee Wage Computation");

        int parttimeornot = (int) (Math.random()*2); // generates a random value 0 or 1
        int wagePerHour = 20;
        int FullDayHour = 8;
        int parttimehour = 2;
        int parttimepay_perhour = 8;
        int general_pay = wagePerHour*FullDayHour;
        switch (parttimeornot){
            case 1 -> System.out.println("the part time payment is added so total pay is " + general_pay + parttimehour*parttimepay_perhour);
            case 0 -> System.out.println("the general pay is " + general_pay);
            default -> System.out.println("You are no longer an employee please contact administration!");
        }

    }
}
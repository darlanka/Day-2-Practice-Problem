import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome! to Employee Wage Computation");
        System.out.println("Please Enter the Employee name and id to get the attendece!");
        System.out.println("Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Id: ");
        int id = sc.nextInt();

        Employee e1 = new Employee(name,id);
        e1.attendence();
    }
}
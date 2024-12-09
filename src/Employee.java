import java.util.Random;

public class Employee {
    String name;
    int id;
    public void parttime_and_wage(){
        int attendence = (int) (Math.random()*2);
        int workinghours = 20;
        int workinghoursperDay = 8;
        if(attendence == 1){
            System.out.println("Daily wages per day is : " + workinghours*workinghoursperDay);
        }
        // user case 3
        boolean partTime = false;
        int wage_Per_hour_in_part_time = 8;
        int noOfHoursWorked = 0;

        if(partTime == true){
            System.out.println("Daily wages for part time based on working hours " + wage_Per_hour_in_part_time*workinghours);
        }

    }
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

}

import java.util.Random;

public class Employee {
    String name;
    int id;
    public void attendence(){
        Random rand = new Random();
        int i = (rand.nextInt(1000))%2;
        // when we choose two choices best relation is mod by 2
        if(i == 1){
            System.out.println("Employee is present!");
        }
        else {
            System.out.println("Employee is absent!");
        }
    }
    Employee(String name,int id){
        this.name = name;
        this.id = id;

    }
}

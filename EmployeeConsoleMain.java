
import java.io.Console;

class EmployeeConsole {
    int emp_id;
    String emp_name;
    double emp_sal;

    public void acceptDetails()  {
        Console c = System.console();

        System.out.println("Enter the employee id ");
        emp_id = Integer.parseInt(c.readLine());

        System.out.println("Enter the name of Employee ");
        emp_name = c.readLine();

        System.out.println("Enter the salary of employee ");
        emp_sal = Double.parseDouble(c.readLine());
    }

    public void displayDetails() {
        System.out.println("Employee id :: "+this.emp_id);
        System.out.println("Employee name :: "+this.emp_name);
        System.out.println("Employee salary :: "+this.emp_sal);
    }
}
public class EmployeeConsoleMain {
    public static void main(String[] args) {
        EmployeeConsole emp_1 = new EmployeeConsole();
        EmployeeConsole emp_2 = new EmployeeConsole();

        emp_1.acceptDetails();
        emp_2.acceptDetails();

        emp_1.displayDetails();
        emp_2.displayDetails();

    }


}

/*
C:\Users\Coditas\Documents\Programs>javac EmployeeConsoleMain.java

C:\Users\Coditas\Documents\Programs>java EmployeeConsoleMain
Enter the employee id
1
Enter the name of Employee
Ashraf
Enter the salary of employee
50000
Enter the employee id
2
Enter the name of Employee
Aman
Enter the salary of employee
55000
Employee id :: 1
Employee name :: Ashraf
Employee salary :: 50000.0
Employee id :: 2
Employee name :: Aman
Employee salary :: 55000.0

* */

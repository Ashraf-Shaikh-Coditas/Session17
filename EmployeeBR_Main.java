package Week4.Session17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class EmployeeBR {
    int emp_id;
    String emp_name;
    double emp_sal;

    public void acceptDetails() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the employee id ");
        emp_id = Integer.parseInt(br.readLine());

        System.out.println("Enter the name of Employee ");
        emp_name = br.readLine();

        System.out.println("Enter the salary of employee ");
        emp_sal = Double.parseDouble(br.readLine());
    }

    public void displayDetails() {
        System.out.println("Employee id :: "+this.emp_id);
        System.out.println("Employee name :: "+this.emp_name);
        System.out.println("Employee salary :: "+this.emp_sal);
    }
}

public class EmployeeBR_Main {
    public static void main(String[] args) throws IOException {
        EmployeeBR emp_1 = new EmployeeBR();
        EmployeeBR emp_2 = new EmployeeBR();

        emp_1.acceptDetails();
        emp_2.acceptDetails();

        emp_1.displayDetails();
        emp_2.displayDetails();
    }
}

/*
Enter the employee id
1
Enter the name of Employee
Ashraf Shaikh
Enter the salary of employee
50000

Enter the employee id
2
Enter the name of Employee
Aman Shaikh
Enter the salary of employee
55000

Employee id :: 1
Employee name :: Ashraf Shaikh
Employee salary :: 50000.0

Employee id :: 2
Employee name :: Aman Shaikh
Employee salary :: 55000.0

* */
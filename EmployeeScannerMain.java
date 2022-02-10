package Week4.Session17;

import java.util.Scanner;

class EmployeeSC {
    int emp_id;
    String emp_name;
    double emp_sal;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee id ");
        emp_id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter the name of Employee ");
        emp_name = scanner.nextLine();

        System.out.println("Enter the salary of employee ");
        emp_sal = scanner.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Employee id :: "+this.emp_id);
        System.out.println("Employee name :: "+this.emp_name);
        System.out.println("Employee salary :: "+this.emp_sal);
    }
}

public class EmployeeScannerMain {
    public static void main(String[] args) {
        EmployeeSC emp_1 = new EmployeeSC();
        EmployeeSC emp_2 = new EmployeeSC();

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

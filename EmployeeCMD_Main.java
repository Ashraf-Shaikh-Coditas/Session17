package Week4.Session17;

public class EmployeeCMD_Main {
    public static void main(String[] args) {
        String emp_name = args[0];
        int emp_id = Integer.parseInt(args[1]);
        double emp_sal = Double.parseDouble(args[2]);

        System.out.println("Employee id :: "+emp_id);
        System.out.println("Employee name :: "+emp_name);
        System.out.println("Employee salary :: "+emp_sal);

    }
}

/*

Employee id :: 1
Employee name :: Ashraf
Employee salary :: 50000.0

* */

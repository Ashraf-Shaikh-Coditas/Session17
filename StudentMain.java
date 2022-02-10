package Week4.Session17;
//1)EXECUTE SIMPLE SCANNER EXAMPLE FOR STUDENT(ID,NAME,MARKS)
//	CASE1=>ACCEPT DATA IN NAME,ID,MARKS SEQUENCE
//			=>USING nextLine() method
//	CASE2=>ACCEPT DATA IN ID,MARKS,STRING SEQUENCE
//			=>can select as per your choice or as per logic

import java.util.Scanner;

class Student {
    String name;
    int id;
    float percentage;

    public void acceptDataOne() {
        // CASE 1 :
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Student ");
        name = scanner.nextLine();

        System.out.println("Enter the id of Student ");
        id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the percentage of Student ");
        percentage = Float.parseFloat(scanner.nextLine());
    }

    public void acceptDataTwo() {
        // CASE 2 :
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the id of Student ");
        id = scanner.nextInt();

        System.out.println("Enter the percentage of Student ");
        percentage = scanner.nextFloat();

        scanner.nextLine();       // to consume the new Line which appears because of pressing Enter
        System.out.println("Enter the name of Student ");
        name = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Name :: "+this.name+"\n" +
                "Id :: "+this.id+"\n"+"" +
                "Percentage :: "+this.percentage;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student obj_s1 = new Student();
        Student obj_s2 = new Student();

        obj_s1.acceptDataOne();
        System.out.println(obj_s1);

        obj_s2.acceptDataTwo();
        System.out.println(obj_s2);
    }

}

/*
Enter the name of Student
Ashraf
Enter the id of Student
1
Enter the percentage of Student
78.4

Name :: Ashraf
Id :: 1
Percentage :: 78.4

Enter the id of Student
2
Enter the percentage of Student
87.9
Enter the name of Student
Jack

Name :: Jack
Id :: 2
Percentage :: 87.9


* */
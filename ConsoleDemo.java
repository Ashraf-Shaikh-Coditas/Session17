//package Week4.Session17;

import java.io.Console;
import java.util.Scanner;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Enter your username ");
        String name = c.readLine();

        System.out.println("Enter your Password ");
        String pwd = String.valueOf(c.readPassword());

        String actualPwd = "Ashraf";


        if(pwd.equals(actualPwd)) {
            System.out.println("Welcome "+name);
        } else {
            System.out.println("Sorry Invalid credentials ");
        }

        c.writer().println("Welcome to the console ...");

        Scanner scanner = new Scanner(c.reader());
        System.out.println("Enter your full name ");
        String fname = scanner.nextLine();
        System.out.println("Your full name is :: "+fname);

        c.printf("Hi %s , Your entered password is %s \n",name,pwd);
        c.format("Hi %s , Your entered password is %s ",name,pwd);

    }

}

/*
C:\Users\Coditas\Documents\Programs>javac ConsoleDemo.java

C:\Users\Coditas\Documents\Programs>java ConsoleDemo
Enter your username
Ashraf
Enter your Password

Sorry Invalid credentials

Welcome to the console ...
Enter your full name
Ashraf Shaikh
Your full name is :: Ashraf Shaikh
Hi Ashraf , Your entered password is Ashra
Hi Ashraf , Your entered password is Ashra

* */

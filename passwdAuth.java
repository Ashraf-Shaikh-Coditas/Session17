package Week4.Session17;

import java.io.*;

public class passwdAuth {
    public static void main(String args[]) {
        try {
            String logFileName = args[0];
            File f = new File("src/Week4/Session17/" + logFileName);
            boolean access_granted = false;
            String password = "";
            int integer = 5;

            if (args.length == 2) {
                System.out.println("Checking command-line password");
                password = password + args[1];
                if (password.equals("3dTAqb.7")) {
                    access_granted = true;
                    System.out.println("Password matches.");
                } else
                    System.out.println("Command-line password does not match");
            }//end if

            if (access_granted) {
                System.out.println("Access granted!");
                System.out.println("Password is :: "+password);

                PrintWriter out = new PrintWriter(new FileOutputStream(f, true));
                FileInputStream f1 = new FileInputStream("src/Week4/Session17/" + args[0]);


                out.println();
                out.print("Updated...");
                out.println();

                DataInputStream din = new DataInputStream(f1);
                int i = 0;
                while ((i = din.read()) != -1) {
                    System.out.print((char) i);
                }

                out.flush();
                out.close();
            }//end if


        }//end try
        catch (Exception e) {
            System.out.println("an error has occured.");
            //e.printStackTrace();
        }


    }//end main
}//end class

/*
 File created : log.txt
* */
/*
Checking command-line password
Password matches.
Access granted!
Password is :: 3dTAqb.7
Hello World
This is a java Assignment .


Updated...


* */

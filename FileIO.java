package Week4.Session17;

import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        File f1 = new File("src/Week4/Session17/file1.txt");
        FileOutputStream fout = new FileOutputStream(f1);
        DataOutputStream dout = new DataOutputStream(fout);

        if(f1.exists()){

            String s=" A , very warm welcome to all of you !! \n" +
                    "Writing to the file ...";
            byte[] b=s.getBytes();
            fout.write(b);
        }
        else
            System.out.println("File does not exist");

        FileInputStream fin = new FileInputStream(f1);
        DataInputStream din = new DataInputStream(fin);

        if(f1.exists()){
            int i=0;
            while ((i=din.read())!=-1){
                System.out.print((char)i);
            }
        }
        else
            System.out.println("Oops,File not found");


    }
}

/*
* File created :: file1.txt
* */

/*
 A , very warm welcome to all of you !!
Writing to the file ...

* */
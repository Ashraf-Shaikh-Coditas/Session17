package Week4.Session17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("src/Week4/Session17/pw.txt");

        PrintWriter writer = new PrintWriter(new FileOutputStream(f));
        writer.write("Hello World :: ");

        writer.write("Hi , This is Ashraf ");
        writer.flush();
        writer.close();
    }
}

/*
 File created :: pw.txt
* */
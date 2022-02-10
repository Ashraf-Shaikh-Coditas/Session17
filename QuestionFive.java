package Week4.Session17;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
//5)Closing Streams is important or not? Explain by writing code
//=> It is always advised to closed our streams after we use them . So that no data will be leaked.
// Also in the below code if we don't close f1 stream , data will not be written in the file till we close
// f1 .
// This is because compiler thinks that some task is remaining to be performed .
// So , even if our code is running properly , It is important to close streams.

public class QuestionFive {
    public static void main(String args[]) throws IOException {
        CharArrayWriter out=new java.io.CharArrayWriter();
        out.write("Char Array Demo text ");

        FileWriter f1=new FileWriter("src/Week4/Session17/a1.txt");

        out.writeTo(f1);

        f1.close();
       }
}

/*
*  File Created : a1.txt
* */

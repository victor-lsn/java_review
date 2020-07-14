package day09_IO;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 下午12:08
 */
public class demo18_printStream {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream("src/day09_IO/c.txt");
        printStream.println("hello");
        System.setOut(printStream);//设置打印目的地
        System.out.println("nihao");
        printStream.flush();
        printStream.close();
    }
}

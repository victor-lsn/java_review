package day09_IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午10:22
 */
public class demo09_Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/day09_IO/b.txt", true);
        char[] b = {'q', 'c', 'b'};
        fileWriter.write(b);
        fileWriter.flush();

        fileWriter.write(b, 0, 1);
        fileWriter.flush();
        fileWriter.close();
    }
}

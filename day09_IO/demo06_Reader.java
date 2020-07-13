package day09_IO;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午9:47
 */
public class demo06_Reader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/day09_IO/b.txt");
        int read = 0;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char) read);
        }

        fileReader.close();
    }
}

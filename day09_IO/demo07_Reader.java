package day09_IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午10:02
 */
public class demo07_Reader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/day09_IO/b.txt");

        char[] chars = new char[1024];
        int len = 0;

        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }

        fileReader.close();
    }
}

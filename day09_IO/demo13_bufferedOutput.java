package day09_IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 上午8:58
 */
public class demo13_bufferedOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/day09_IO/c.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(78);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}

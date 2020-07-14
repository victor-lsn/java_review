package day09_IO;

import java.io.*;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 上午10:11
 */
public class demo16_OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("src/day09_IO/c.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "GBK");
        System.out.println(outputStreamWriter.getEncoding());
        outputStreamWriter.write("妹妹你好");
        outputStreamWriter.close();

        System.out.println(new File("src/day09_IO/c.txt").length());

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("src/day09_IO/c.txt"), "GBK");
        int len = 0;
        char[] chars = new char[1024];
        while ((len = inputStreamReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

        while ((len = inputStreamReader.read()) != -1) {
            System.out.println((char) len);
        }
        inputStreamReader.close();
    }
}

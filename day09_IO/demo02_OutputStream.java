package day09_IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午6:47
 */
public class demo02_OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/day09_IO/b.txt",true);
        fos.write("你好我是victor\n".getBytes());//\n表示换行
        fos.close();
    }
}

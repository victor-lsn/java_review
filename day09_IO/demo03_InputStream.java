package day09_IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午7:56
 */
public class demo03_InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/day09_IO/b.txt");
        int len=0;
        while ((len=fis.read())!=-1){//内部指针会向后移，所以必须定义变量，不然缺少字节
            System.out.println(len);
        }

        fis.close();
    }
}

package day09_IO;

import java.io.*;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午5:55
 */
public class demo01_Output {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/day09_IO/a.txt");
        fos.write(98);
        fos.write(49);
        fos.write(48);
        fos.write(48);

        byte[] a={-12,-78,-23,-34,78};//两个负数会合并成为汉字
        fos.write(a);


        byte[] b={78,23,34};
        fos.write(b,0,1);

        byte[] bytes = "你好".getBytes();
        fos.write(bytes);

        fos.close();


        File file=new File("src/day09_IO/a.txt");
        System.out.println(file.length());
    }
}

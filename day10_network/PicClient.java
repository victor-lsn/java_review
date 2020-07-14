package day10_network;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 下午4:22
 */
public class PicClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/home/victor/图片/1.png");
        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream os = socket.getOutputStream();

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }

        socket.shutdownOutput();//上传不会有终止符号，所以使用这条语句来终止循环并加上终止符号

        InputStream is = socket.getInputStream();
        byte[] bytes2 = new byte[1024];
        is.read(bytes2);
        System.out.println(new String(bytes2));

        fileInputStream.close();
        socket.close();

    }
}

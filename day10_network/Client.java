package day10_network;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 下午3:40
 * TCP通信客户端
 * 套接字：包含了IP地址和端口号的网络单位
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好服务器".getBytes());
        outputStream.flush();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        inputStream.read(bytes);
        System.out.println(new String(bytes));

        socket.close();
    }
}

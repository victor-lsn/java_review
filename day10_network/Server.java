package day10_network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 下午3:50
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        inputStream.read(bytes);

        System.out.println(new String(bytes));


        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("我是服务器，同意链接".getBytes());
        outputStream.flush();
        accept.close();
        serverSocket.close();
    }
}

package day10_network;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 下午4:22
 */
public class PicServer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/day10_network/2.png");
        ServerSocket serverSocket = new ServerSocket(8080);

        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }


        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());


        fos.close();
        socket.close();
        serverSocket.close();

    }
}

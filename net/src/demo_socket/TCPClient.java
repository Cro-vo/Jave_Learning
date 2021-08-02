package demo_socket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1",8080);
		// 传输字节流
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		// 本地字节流
		FileInputStream fis = new FileInputStream("ttt.jpg");
		
		int len = 0;
		byte[] bytes = new byte[1024];
		while((len = fis.read(bytes)) != -1)
		{
			os.write(bytes);
		}
		// 由于-1无法传递过去，需要手动关闭
		socket.shutdownOutput();
		
		Arrays.fill(bytes, (byte)0);
		len = 0;
		while((len = is.read(bytes)) != -1)
		{
			System.out.println(new String(bytes, 0, len));
		}
		
		
		fis.close();
		socket.close();
	}

}

package net_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 带参构造，绑定服务器IP：端口
		Socket socket = new Socket("127.0.0.1", 8080);
		OutputStream os = socket.getOutputStream();
		InputStream is = socket.getInputStream();
		
		// 向服务器发送数据
		os.write("你好服务器".getBytes());// 由于数据不仅是字符，因此使用字节流
		
		// 输出服务器返回的内容
		byte[] bytes = new byte[1024];
		int len = 0;
		len = is.read(bytes);
		System.out.println(new String(bytes, 0, len)); // 把从服务端端获取的内容输出
		
		socket.close();
	}

}

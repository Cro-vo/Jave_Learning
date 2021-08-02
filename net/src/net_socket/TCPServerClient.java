package net_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 使用端口号创建服务器
		ServerSocket server = new ServerSocket(8080);
		Socket client = server.accept();
		// 获取并使用客户端的IO流对象
		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		
		byte[] bytes = new byte[1024];
		int len = 0;
		len = is.read(bytes);
		System.out.println(new String(bytes, 0, len));// 把从服务端端获取的内容输出
		
		// 回复客户端
		os.write("收到！".getBytes());
		
		client.close();
		server.close();
		
	}

}

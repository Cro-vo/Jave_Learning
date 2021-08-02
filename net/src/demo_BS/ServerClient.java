package demo_BS;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerClient {

	/*
	 创建BS版本服务器
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 创建服务器对象
		ServerSocket server = new ServerSocket(8080);
		while(true)
		{
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						// 获取客户端对象（浏览器）
						Socket socket = server.accept();
						InputStream is = socket.getInputStream();
						
						// 浏览器请求服务器http://127.0.0.1:8080/net/web/index.html
						// 输出浏览器请求的信息
//						byte[] bytes = new byte[1024];
//						int len = 0;
//						while((len = is.read(bytes)) != -1)
//						{
//							System.out.println(new String(bytes, 0, len));
//						}
						
						// 获取服务器的html路径
						BufferedReader br = new BufferedReader(
								new InputStreamReader(is)); 
						String line = br.readLine();
						String[] arr = line.split(" ");
						String htmlpath = arr[1].substring(1);
//						System.out.println(htmlpath);
						// 响应客户端请求，发送html文件
//						File file = new File(htmlpath);
//						System.out.println(file.getAbsolutePath());
//						System.out.println(file.exists());
						FileInputStream fis = new FileInputStream(htmlpath);

						OutputStream os = socket.getOutputStream();
						
						// 响应头部内容
						os.write("HTTP/1.1 200 OK\r\n".getBytes());
						os.write("Content-Type:txt/html\r\n".getBytes());
						os.write("\r\n".getBytes());
						
						// 将html内容返回给浏览器
						int len = 0;
						byte[] bytes = new byte[1024];
						while((len = fis.read(bytes)) != -1)
						{
							os.write(bytes, 0, len);
						}
						
						fis.close();
						socket.close();
					} catch (IOException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}).start();
		}
	}

}

package demo_socket;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(8080);
		while(true)
		{
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						Socket socket = server.accept();
						InputStream is = socket.getInputStream();
						OutputStream os = socket.getOutputStream();
						// 判断文件夹是否存在
						File file = new File("upload");
						if (!file.exists())
						{
							file.mkdirs();
						}
						String filename = "itcast"+System.currentTimeMillis()
						+new Random().nextInt(999999)+".jpg";
						
						FileOutputStream fos = new FileOutputStream(file + "\\" + filename);
						
						int len = 0;
						byte[] bytes = new byte[1024];
						while((len = is.read(bytes)) != -1)
						{
							fos.write(bytes, 0, len);
						}
						
						os.write("上传成功！".getBytes());
						fos.close();
						socket.close();
					} catch (IOException e) {
						// TODO: handle exception
						System.out.println(e);
					}
				}
			}).start();
		}
		
//		server.close();
	}

}

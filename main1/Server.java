package main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		ServerSocket socket = null;
		OutputStream outputStream = null;
		InputStream inputStream = null;
		Scanner in = null;
		Scanner inStream = null;
		PrintWriter outStream = null;
		
		try {
			System.out.println("This is server. Waiting for the connection.");
			
			//初始化服务器端的socket接口
			socket = new ServerSocket(2234);
			
			//开始调用accept，接到后返回客户端的socket对象
			Socket server = socket.accept();
			
			//获取向客户端发送消息的输入、输出流
			outputStream = server.getOutputStream();
			inputStream = server.getInputStream();

			System.out.println("aaa: " + server.getInetAddress().getHostAddress());
			outStream = new PrintWriter(outputStream,true);
			
			//在输入、输出流和用户命令行输入建立联系
			in = new Scanner(System.in);
			inStream = new Scanner(inputStream);
			String massage = inStream.nextLine();
			System.out.println("client->server: " + massage);
			outStream.println(massage + " 我已接收到你的申请。");
			
			while(true)
			{
					//获取客户端发来的消息并输出
					String info = inStream.nextLine();
					System.out.println("client->server: " + info);

					//获取服务器端命令行的输入发送给客户端并输出
					String msg = in.nextLine();
					outStream.println(msg);
					System.out.println("server->client: " + msg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//释放资源
				outputStream.close();
				inputStream.close();
				in.close();
				inStream.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

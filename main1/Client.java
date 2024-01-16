package main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner inStream = null;
		Socket socket = null;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		PrintWriter outStream = null;
		
		try {
			//建立与服务器端的连接，获取地址
			System.out.println("This is client, please input server IP location.");
			String ip = in.nextLine();
			socket = new Socket(ip, 2234);
			System.out.println("Server IP location is " +ip);
			System.out.println("请输入你的姓名和学号");

			//获取服务器发过来的字节流
			inputStream = socket.getInputStream();
			outputStream = socket.getOutputStream();
			outStream = new PrintWriter(outputStream,true);
		
			//在输入、输出流和用户命令行输入建立联系
			inStream = new Scanner(inputStream);

			//获取用户在客户端命令行输入的数据并本地回显后发送到服务器
			String msg = in.nextLine();
			System.out.println("client->server: " + msg);
			outStream.println(msg);
			
			//获取服务器发过来的一行数据并显示
			String info = inStream.nextLine();
			System.out.println("server->client: " +info);
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			//最后关闭资源
			try {
				socket.shutdownInput();
				socket.shutdownOutput();
				inputStream.close();
				outputStream.close();
				socket.close();
				in.close();
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

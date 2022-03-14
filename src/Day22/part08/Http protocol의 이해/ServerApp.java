import java.io.*;
import java.net.*;

/*
  File Name : ServerApp.java
  :: Browser ���� http protocol �̿� ServerApp �� request ��
  :: Data �� ��� �����ϴ��� Ȯ�� ���� port 7000 �� open �ϴ� 
  :: Server ������ ServerApp
*/
public class ServerApp{

	///main method		
	public static void main(String[] args) throws Exception{

		// 7000 port �� open �ϴ�  ServerSocket �ν��Ͻ� ����
		ServerSocket ss = new ServerSocket(7000);
		System.out.println("7000�� port �� client �� ������ ��ٸ��ϴ�.......");

		// 7000 prot ���ӽ� socket �ν��Ͻ� ����
		Socket s = ss.accept();

		System.out.println("Client : "+s.getInetAddress().getHostName()+ " :: 7000 port ����");
			
		System.out.println("\n*****************************************************");
		System.out.println("**** IE���� ������ ������ �Ʒ��� �����ϴ�.****");
		System.out.println("*****************************************************\n");

		// browser���� ���۵� ������ �б����� InputStream ����
		InputStream is = s.getInputStream();
		
		// client (browser)�� ���� ���� ���� ���� ���
		while(true){
			int i = is.read();
			System.out.print((char)i);
			if(i == -1) break;
		}
		
	}//end of main

}//end of class
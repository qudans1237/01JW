import java.io.*;
import java.net.*;

/*
* File Name : ClientApp.java
*  �� Browser ���� http protocol�� WebServer �� Request �� 
*  �� WebServer ����  http protocal �̿� ���  response �ϴ��� 
*  �� Ȯ���� ���� client(brower)�� ������ �����ϴ� ClientApp
*/
public class ClientApp{

	///main method
	public static void main(String[] args) throws Exception{
		
		// 127.0.0.1 IP �� 80port �� W/S  ���� Socket �ν��Ͻ�����
		Socket s = new Socket("127.0.0.1",80);
		
		// W/S�� data ���� �� �ޱ� ����
		// socket �ν��Ͻ��� ����  Inputstream/OutputStream�� ����, return  ����

		//1. InputStream����
		InputStream is = s.getInputStream();
		//2. OutputStream����
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os,true);

		//  W/S �� data ���� 
		// ���� ������ "Header �� ���۶���" ���� ������ data ����
		pw.println("GET /aaa.html HTTP/1.1");
		pw.println();

		System.out.println("\n*****************************************************");
		System.out.println("**** ip 127.0.0.1   WebServer��              ****");
		System.out.println("**** \"GET /aaa.html http/1.1\"�� ������ ****");
		System.out.println("*****************************************************\n");

		// W/S ���� ���۵� Data �� ���
		System.out.println("\nnnnn*****************************************************");
		System.out.println("**** WebServer���� ������ ������ �Ʒ��� �����ϴ�.****");
		System.out.println("*****************************************************\n");

		int i = 0 ;
		while( (i = is.read()) !=-1){
			System.out.print((char)i);
		}
		System.out.println("\n end-----------------------------------------------------");

		//Stream,Socket�� close
		os.close();
		is.close();
		s.close();

	}//end of main

}//end of class
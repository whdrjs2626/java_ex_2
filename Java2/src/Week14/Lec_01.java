package Week14;
import java.io.*;
public class Lec_01 { // ���� ��ȯ ������Ʈ��
	public static void main(String[] args) throws Exception {
		write("���� ��ȯ ��Ʈ���� ����մϴ�.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("test.txt");
		Writer wr = new OutputStreamWriter(fos); // ���� ��Ʈ��
		wr.write(str); //OutputStreamWriter���� ��Ʈ���� �̿��� ���� ���
		wr.flush(); // String ��ü str �ѹ��� ��� ����
		wr.close();
	}
	
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("test.txt");
		Reader rd = new InputStreamReader(fis); // ������Ʈ�� ����
		char[] buffer = new char[100];
		int readNum = rd.read(buffer); // InputStreamReader������Ʈ������ ���� �Է�
		rd.close();
		String data = new String(buffer, 0, readNum); // buffer���� ���� ����ŭ ���ڿ��� ��ȯ
		return data;
	}
}

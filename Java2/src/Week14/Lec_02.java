package Week14;

import java.io.*;

public class Lec_02 { // ���� ��� ������Ʈ��
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("sample.txt")); // ������Ʈ����ü����
		while(true) {
			String data = br.readLine(); //���� ������ ���ڿ� �о����
			if(data == null) // ���� ���� ������ ���
				break;
			System.out.println(data);
		}
		br.close(); // ������Ʈ�� br�� ������ ����Ǿ� �ִ� ��Ʈ���� ������!
	}
}

package Week14;

import java.io.*;

public class Answer_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Answer_01_input.txt")); // ������Ʈ�� ��ü ����
		int num = 1; // ���� ��ȣ�� ���� ����
		String data = null;
		while((data = br.readLine()) != null) {
			System.out.println(num++ + ") " + data);
		}
		br.close(); // ������Ʈ�� br�� ������ ����Ǿ� �ִ� ��Ʈ���� ������!
	}
}

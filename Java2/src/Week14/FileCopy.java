package Week14;

import java.util.*;
import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �̸��� �Է��Ͻÿ�: ");
		String inFileName = scan.next();
		System.out.print("���� ���� �̸��� �Է��Ͻÿ�: ");
		String outFileName = scan.next();
		InputStream inStream = new FileInputStream(inFileName);
		OutputStream outStream = new FileOutputStream(outFileName);
		int c;
		while ((c = inStream.read()) != -1) {
			outStream.write(c);
		}

		System.out.println(inFileName + "�� " + outFileName + "�� �����Ͽ����ϴ�. ");
		inStream.close();
		outStream.close();
	}
}

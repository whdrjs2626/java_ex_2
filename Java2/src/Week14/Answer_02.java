package Week14;

import java.io.*;

public class Answer_02 {
	public static void main(String[] args) throws Exception {
		System.out.println("기초 자료형을 파일로 출력합니다.");
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Answer_02.txt")));
		out.writeInt(1);
		out.writeShort(12);
		out.writeLong(123);
		out.writeFloat(123.4f);
		out.writeDouble(123.45);
		out.flush();
		out.close();
		
		System.out.println("파일에 저장된 기초 자료형을 출력합니다.");
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Answer_02.txt")));
		System.out.println(in.readInt()); // 반드시 쓰는 순서와 읽는 순서가 같게 해야 함
		System.out.println(in.readShort());
		System.out.println(in.readLong());
		System.out.println(in.readFloat());
		System.out.println(in.readDouble());
		in.close();
	}
}

package Week14;
import java.io.*;
public class Lec_03 { // �⺻ ���� ����� ���� ��Ʈ��
	public static void main(String[] args) throws Exception {
		DataInputStream in = null;
		DataOutputStream out = null;
		
		//���� ��Ʈ�� -> ���� ��Ʈ��(���� ����� ����) -> ������ ��Ʈ��(���� Ÿ�� �Է��� ����)
		out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
		out.writeDouble(3.14);
		out.writeInt(100);
		out.writeUTF("�ڽ��� ������ �ٲ� �� ����.");
		out.flush();
		out.close();
		
		in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.bin")));
		System.out.println(in.readDouble());
		System.out.println(in.readInt());
		System.out.println(in.readUTF()); // @@@�� ������ �д� ������ ���� �ؾ���!!
		in.close();
	}
}

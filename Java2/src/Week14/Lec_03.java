package Week14;
import java.io.*;
public class Lec_03 { // 기본 단위 입출력 보조 스트림
	public static void main(String[] args) throws Exception {
		DataInputStream in = null;
		DataOutputStream out = null;
		
		//파일 스트림 -> 버퍼 스트림(버퍼 사용을 위함) -> 데이터 스트림(기초 타입 입력을 위함)
		out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
		out.writeDouble(3.14);
		out.writeInt(100);
		out.writeUTF("자신의 생각을 바꿀 수 없다.");
		out.flush();
		out.close();
		
		in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.bin")));
		System.out.println(in.readDouble());
		System.out.println(in.readInt());
		System.out.println(in.readUTF()); // @@@쓴 순서와 읽는 순서가 같게 해야함!!
		in.close();
	}
}

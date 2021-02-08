package Week14;
import java.io.*;
public class Lec_01 { // 문자 변환 보조스트림
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("test.txt");
		Writer wr = new OutputStreamWriter(fos); // 보조 스트림
		wr.write(str); //OutputStreamWriter보조 스트림을 이용해 문자 출력
		wr.flush(); // String 객체 str 한번에 기록 가능
		wr.close();
	}
	
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("test.txt");
		Reader rd = new InputStreamReader(fis); // 보조스트림 연결
		char[] buffer = new char[100];
		int readNum = rd.read(buffer); // InputStreamReader보조스트림으로 문자 입력
		rd.close();
		String data = new String(buffer, 0, readNum); // buffer에서 읽은 수만큼 문자열로 반환
		return data;
	}
}

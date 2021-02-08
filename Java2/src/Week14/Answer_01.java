package Week14;

import java.io.*;

public class Answer_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Answer_01_input.txt")); // 보조스트림 객체 생성
		int num = 1; // 라인 번호를 위한 변수
		String data = null;
		while((data = br.readLine()) != null) {
			System.out.println(num++ + ") " + data);
		}
		br.close(); // 보조스트림 br만 닫으면 연결되어 있는 스트림도 닫힌다!
	}
}

package Week14;

import java.io.*;

public class Lec_02 { // 성능 향상 보조스트림
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("sample.txt")); // 보조스트림객체생성
		while(true) {
			String data = br.readLine(); //라인 단위로 문자열 읽어오기
			if(data == null) // 파일 끝에 도달한 경우
				break;
			System.out.println(data);
		}
		br.close(); // 보조스트림 br만 닫으면 연결되어 있는 스트림도 닫힌다!
	}
}

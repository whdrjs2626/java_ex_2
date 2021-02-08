package Week13;

import java.util.ArrayList;
import java.util.Arrays;

public class Answer2 {
	public static void main(String[] args) {
		String[] s = {"사과", "배", "바나나"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
		
		list.add("포도"); // 1. "포도"를 리스트의 마지막에 삽입
		list.add(2, "자몽"); // 2. "자몽"을 인덱스 2에 삽입
		
		System.out.println(" ---- 리스트 출력 ---- "); // 3. 리스트에 저장된 데이터 출력
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println(" ---------------- ");
		
		System.out.println("인덱스 3 : " + list.get(3)); // 4. 인덱스 3에 저장된 데이터 출력
		list.set(2, "메론"); // 5. 인덱스 2에 저장된 데이터를 "메론"으로 변환
		list.add("배"); // 6. "배"를 리스트 마지막에 추가
		System.out.println("배가 저장된 위치 : " + list.indexOf("배")); // 7. "배"가 저장된 위치를 출력
		list.remove("바나나"); // 8. 리스트에서 "바나나" 데이터 삭제
		
		System.out.println(" ---- 리스트 출력 ---- "); // 9. 리스트에 저장된 데이터 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(" ---------------- ");
	}
}

package Week13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person {
	private String name; // 이름
	private String num; // 전화번호

	public Person(String name, String num) {
		this.name = name;
		this.num = num;
	}

	public String toString() {
		return " [이름 : " + name + ",  전화번호 : " + num + "]";
	}
}

public class Answer4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Person> map = new HashMap<>(); // String형 key와 Person형 value가 저장되는 HashMap
		map.put("a010203", new Person("박종건", "010-1111-2222")); // 임의의 데이터 5개를 저장했습니다.
		map.put("b050607", new Person("심청이", "010-3333-4444"));
		map.put("c080910", new Person("홍길동", "010-5555-6666"));
		map.put("d111213", new Person("김철수", "010-7777-8888"));
		map.put("e141516", new Person("김영희", "010-9999-0000"));

		System.out.print("id 입력 : "); 
		String id = in.nextLine(); 
		if(map.containsKey(id)) { // 위에서 입력한 id가 map의 key중에 있다면
			System.out.println("id가 " + id + " 인 사람 : " + map.get(id)); // 해당 Person 데이터 출력
		} else { // 없다면
			System.out.println("입력하신 id의 객체가 존재하지 않습니다.");
		}
		
		System.out.println("\n ----------------- HashMap에 저장된 모든 데이터 ----------------- ");
		for (Map.Entry<String, Person> s : map.entrySet()) { // 모든 항목을 방문합니다.
			System.out.println("key = " + s.getKey() + ", value = " + s.getValue());
		}
	}
}

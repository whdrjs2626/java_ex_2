package Week13;

import java.util.HashMap;
import java.util.Map;

class Count {
	static Map<Integer, Integer> count() {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 1; i <= 6; i++) {
			map.put(i, 0); // map에 1 ~ 6 의 키값을 삽입해 줍니다. value는 빈도수로 처음엔 0입니다.
		}
		for(int i = 0; i < 100; i++) { // 주사위를 총 100번 굴립니다.
			int num = (int)(Math.random()*6+1); // 주사위를 굴립니다. 1 ~ 6의 난수 num
			if(map.containsKey(num)) { // 위에서 나온 주사위 눈의 빈도수를 1 올려줍니다.
				map.put(num, map.get(num)+1); // 원래 빈도수에 1을 추가해 다시 저장해줍니다.
			}
		}
		return map; // 빈도수를 저장한 HashMap을 리턴해줍니다.
	}

	static void write(Map<Integer, Integer> map) {
		map.forEach((key, value) -> { // 출력은 forEach을 사용했습니다.
			System.out.println("주사위 눈 = " + key + ", 빈도수 = " + value);
		});
	}
}

public class Answer3 {
	public static void main(String args[]) {
		Map<Integer, Integer> map;
		map = Count.count(); // 빈도수를 계산한 HashMap을 반환받아 저장
		System.out.println("Map에 저장된 빈도수를 출력합니다");
		Count.write(map); // HashMap에 저장된 원소 출력
	}
}



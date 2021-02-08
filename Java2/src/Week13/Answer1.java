package Week13;

import java.util.HashSet;
import java.util.Set;

public class Answer1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() < 10) { // 해시셋에 저장하여 난수의 중복을 방지합니다.
			set.add((int) (Math.random()*90) + 10); // 10 ~ 99 까지 두자리 수의 난수를 저장합니다.
		}
		System.out.println("두자리 수 난수 10개를 출력합니다.");
		for(int element : set) { // 출력은 향상된 for문을 사용했습니다.
			System.out.print(element + "  ");
		}
	}
}

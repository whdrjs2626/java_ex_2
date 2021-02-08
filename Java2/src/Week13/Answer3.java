package Week13;

import java.util.HashMap;
import java.util.Map;

class Count {
	static Map<Integer, Integer> count() {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 1; i <= 6; i++) {
			map.put(i, 0); // map�� 1 ~ 6 �� Ű���� ������ �ݴϴ�. value�� �󵵼��� ó���� 0�Դϴ�.
		}
		for(int i = 0; i < 100; i++) { // �ֻ����� �� 100�� �����ϴ�.
			int num = (int)(Math.random()*6+1); // �ֻ����� �����ϴ�. 1 ~ 6�� ���� num
			if(map.containsKey(num)) { // ������ ���� �ֻ��� ���� �󵵼��� 1 �÷��ݴϴ�.
				map.put(num, map.get(num)+1); // ���� �󵵼��� 1�� �߰��� �ٽ� �������ݴϴ�.
			}
		}
		return map; // �󵵼��� ������ HashMap�� �������ݴϴ�.
	}

	static void write(Map<Integer, Integer> map) {
		map.forEach((key, value) -> { // ����� forEach�� ����߽��ϴ�.
			System.out.println("�ֻ��� �� = " + key + ", �󵵼� = " + value);
		});
	}
}

public class Answer3 {
	public static void main(String args[]) {
		Map<Integer, Integer> map;
		map = Count.count(); // �󵵼��� ����� HashMap�� ��ȯ�޾� ����
		System.out.println("Map�� ����� �󵵼��� ����մϴ�");
		Count.write(map); // HashMap�� ����� ���� ���
	}
}



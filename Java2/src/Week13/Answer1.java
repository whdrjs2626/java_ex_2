package Week13;

import java.util.HashSet;
import java.util.Set;

public class Answer1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() < 10) { // �ؽü¿� �����Ͽ� ������ �ߺ��� �����մϴ�.
			set.add((int) (Math.random()*90) + 10); // 10 ~ 99 ���� ���ڸ� ���� ������ �����մϴ�.
		}
		System.out.println("���ڸ� �� ���� 10���� ����մϴ�.");
		for(int element : set) { // ����� ���� for���� ����߽��ϴ�.
			System.out.print(element + "  ");
		}
	}
}

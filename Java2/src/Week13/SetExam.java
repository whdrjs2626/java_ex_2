package Week13;

import java.util.*;

public class SetExam {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham"); // �ߺ��� ���Ҵ� �߰����� ����

		// �ݺ��ڸ� ����� ���
		Iterator<String> iterator = set.iterator(); // �ݺ��� ���
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.print("    " + element);
		}
		System.out.println();
		// ��ü ����
		set.remove("Butter");
		set.remove("Ham");

		// ���ٽ��� ����� ���
		set.forEach((element) -> System.out.print("    " + element));

		set.add("Apple");
		System.out.println();
		// ���� for���� ����� ���
		for (String element : set)
			System.out.print("    " + element);

		set.clear(); // set�� ����� ��� ��ü ����
		if (set.isEmpty()) // set�� ��������� true ��ȯ
			System.out.println("\nHashset�� ������ϴ�");
	}
}

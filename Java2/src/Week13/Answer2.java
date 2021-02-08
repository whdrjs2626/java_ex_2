package Week13;

import java.util.ArrayList;
import java.util.Arrays;

public class Answer2 {
	public static void main(String[] args) {
		String[] s = {"���", "��", "�ٳ���"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
		
		list.add("����"); // 1. "����"�� ����Ʈ�� �������� ����
		list.add(2, "�ڸ�"); // 2. "�ڸ�"�� �ε��� 2�� ����
		
		System.out.println(" ---- ����Ʈ ��� ---- "); // 3. ����Ʈ�� ����� ������ ���
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println(" ---------------- ");
		
		System.out.println("�ε��� 3 : " + list.get(3)); // 4. �ε��� 3�� ����� ������ ���
		list.set(2, "�޷�"); // 5. �ε��� 2�� ����� �����͸� "�޷�"���� ��ȯ
		list.add("��"); // 6. "��"�� ����Ʈ �������� �߰�
		System.out.println("�谡 ����� ��ġ : " + list.indexOf("��")); // 7. "��"�� ����� ��ġ�� ���
		list.remove("�ٳ���"); // 8. ����Ʈ���� "�ٳ���" ������ ����
		
		System.out.println(" ---- ����Ʈ ��� ---- "); // 9. ����Ʈ�� ����� ������ ���
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(" ---------------- ");
	}
}

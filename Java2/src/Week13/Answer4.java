package Week13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person {
	private String name; // �̸�
	private String num; // ��ȭ��ȣ

	public Person(String name, String num) {
		this.name = name;
		this.num = num;
	}

	public String toString() {
		return " [�̸� : " + name + ",  ��ȭ��ȣ : " + num + "]";
	}
}

public class Answer4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Person> map = new HashMap<>(); // String�� key�� Person�� value�� ����Ǵ� HashMap
		map.put("a010203", new Person("������", "010-1111-2222")); // ������ ������ 5���� �����߽��ϴ�.
		map.put("b050607", new Person("��û��", "010-3333-4444"));
		map.put("c080910", new Person("ȫ�浿", "010-5555-6666"));
		map.put("d111213", new Person("��ö��", "010-7777-8888"));
		map.put("e141516", new Person("�迵��", "010-9999-0000"));

		System.out.print("id �Է� : "); 
		String id = in.nextLine(); 
		if(map.containsKey(id)) { // ������ �Է��� id�� map�� key�߿� �ִٸ�
			System.out.println("id�� " + id + " �� ��� : " + map.get(id)); // �ش� Person ������ ���
		} else { // ���ٸ�
			System.out.println("�Է��Ͻ� id�� ��ü�� �������� �ʽ��ϴ�.");
		}
		
		System.out.println("\n ----------------- HashMap�� ����� ��� ������ ----------------- ");
		for (Map.Entry<String, Person> s : map.entrySet()) { // ��� �׸��� �湮�մϴ�.
			System.out.println("key = " + s.getKey() + ", value = " + s.getValue());
		}
	}
}

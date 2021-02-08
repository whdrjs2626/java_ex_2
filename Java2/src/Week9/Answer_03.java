package Week9;

import java.util.Scanner;

class NestStudent {
	private String name;
	Subject subject; // �ν��Ͻ� ��� Ŭ���� Subject�� �������� ����
	Scanner in = new Scanner(System.in);
	
	public NestStudent(String name, int cnt) { // �����ڿ��� �ν��Ͻ� ��� Ŭ���� Subject�� ��ü�� �����մϴ�.
		this.name = name;
		System.out.println(name + "-->");
		this.subject = new Subject(cnt);
	}
	
	void stdPrint() { // ��ü�� ������ ����մϴ�.
		System.out.println("--------------");
		System.out.println(name + "�л��� ���� ����");
		subject.subjectprint();
	}
	
	class Subject { // �ν��Ͻ� ��� Ŭ����
		String[] subject; // ���������� ������ �迭 ����
		public Subject(int num) {
			subject = new String[num]; // �Ű������� ���� num��ŭ �迭�� �����մϴ�.
			for(int i = 0; i < num; i++) {
				System.out.print("���� ���� ( " + (i+1) + " ) : ");
				subject[i] = in.next(); // ���������� Ű����� �Է¹޾� �ʱ�ȭ�մϴ�.
			}
		}
		public void subjectprint() { // �迭�� ����� ���������� ����մϴ�.
			for(String s : subject) {
				System.out.println(s);
			}
		}
	}
}
public class Answer_03 {
	public static void main(String[] args) {
		NestStudent obj[] = { new NestStudent("ȫ�浿", 2), new NestStudent("�Ӳ���", 3), new NestStudent("��û��", 1) };
		for(NestStudent ns : obj) {
			ns.stdPrint();
		}
	}
}

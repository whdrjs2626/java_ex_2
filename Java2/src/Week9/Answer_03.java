package Week9;

import java.util.Scanner;

class NestStudent {
	private String name;
	Subject subject; // 인스턴스 멤버 클래스 Subject의 참조변수 선언
	Scanner in = new Scanner(System.in);
	
	public NestStudent(String name, int cnt) { // 생성자에서 인스턴스 멤버 클래스 Subject의 객체를 생성합니다.
		this.name = name;
		System.out.println(name + "-->");
		this.subject = new Subject(cnt);
	}
	
	void stdPrint() { // 객체의 내용을 출력합니다.
		System.out.println("--------------");
		System.out.println(name + "학생의 수강 과목");
		subject.subjectprint();
	}
	
	class Subject { // 인스턴스 멤버 클래스
		String[] subject; // 수강과목을 저장할 배열 선언
		public Subject(int num) {
			subject = new String[num]; // 매개변수로 받은 num만큼 배열을 생성합니다.
			for(int i = 0; i < num; i++) {
				System.out.print("수강 과목 ( " + (i+1) + " ) : ");
				subject[i] = in.next(); // 수강과목을 키보드로 입력받아 초기화합니다.
			}
		}
		public void subjectprint() { // 배열에 저장된 수강과목을 출력합니다.
			for(String s : subject) {
				System.out.println(s);
			}
		}
	}
}
public class Answer_03 {
	public static void main(String[] args) {
		NestStudent obj[] = { new NestStudent("홍길동", 2), new NestStudent("임꺽정", 3), new NestStudent("심청이", 1) };
		for(NestStudent ns : obj) {
			ns.stdPrint();
		}
	}
}

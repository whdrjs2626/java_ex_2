package Week2;

import java.util.*;

class Member {
	private String id; // 아이디
	private int month; // 생일(월)

	public Member(String id, int month) { // 생성자
		this.id = id;
		this.month = month;
	}

	public String getId() { // id의 getter메소드
		return id;
	}

	public int getMonth() { // month의 getter메소드 
		return month;
	}

	public void setId(String id) {  // id의 setter메소드
		this.id = id;
	}

	public void setMonth(int month) { // month의 getter메소드
		this.month = month;
	}

	@Override
	public String toString() { // 객체 내용를 문자열로 반환하는 toString() 메소드 – 본인작성
		return "Member [Id : " + id + "   Month : " + month + "]";
	}
}

class Memberedit {
	public static void birthday(Member[] arr, int month) { // 회원들의 배열과 달을 매개변수로 받아 입력한 달과 같은 생일을 가진 회원들을 출력하는 메소드
		System.out.println("생일이 " + month + "인 회원 리스트");
		for (int i = 0; i < arr.length; i++) {
			if (month == arr[i].getMonth())
				System.out.println(arr[i]);
		}
	}

	public static void search(Member[] arr, String name) { // 회원들의 배열과 이름을 매개변수로 받아 이름과 일치하는 회원을 출력하는 메소드
		for (int i = 0; i < arr.length; i++) {
			if (name.equals(arr[i].getId())) {
				System.out.println(arr[i]);
				return; // 원하는 이름을 찾으면 그 회원을 출력하고 메소드를 종료시킵니다.
			}
		}
		System.out.println("존재하지 않는 사람입니다."); // 위에 조건문에 들어가지 못하면 이 문장을 출력하게 됩니다.
	}
	
	public static void change(Member[] arr, String before, String after) { // 원래 이름(before)와 변경 할 이름(after)을 매개변수로 받아 이름을 변경하는 메소드
		for (int i = 0; i < arr.length; i++) {
			if (before.equals(arr[i].getId())) {
				arr[i].setId(after);
			}
		}
	}
}

public class TestMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] arr = new Member[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("> ID와 Month 입력 : ");
			arr[i] = new Member(sc.next(), sc.nextInt());
		}
		
		System.out.print(">> month 입력 : ");
		int month = sc.nextInt();
		Memberedit.birthday(arr, month);
		
		System.out.print("> 변경 전 id 입력 : ");
		String pre = sc.next();
		Memberedit.search(arr, pre);
		
		System.out.print("> 변경 후 id 입력 : ");
		String post = sc.next();
		
		Memberedit.change(arr, pre, post);
		
		Memberedit.search(arr, post);
		System.out.println("프로그램을 종료합니다.");
	}
}

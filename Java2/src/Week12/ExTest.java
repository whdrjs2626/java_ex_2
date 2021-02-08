package Week12;

public class ExTest {
	public static void main(String[] args) {
		sub();
	}
	public static void sub() {
		int[] array = new int[] {34, 56, 12, 87, 34, 78};
		try { // 예외가 발생하는 곳에서 직접 처리하는 방식입니다.
		System.out.println("array[array.length] : " + array[array.length]);
		} catch(ArrayIndexOutOfBoundsException e) { // 배열 인덱스 관련 예외 발생시 이 catch문이 실행됩니다.
			System.out.println(e.getMessage());
			System.out.println("배열의 최대 인덱스 " + array.length + " 를(을) 초과하여 접근했습니다.");
		}
	}
}
// 예외 처리방법  1 직접 처리(try catch가 sub안에 있어야함) 2 throw로 던지기(sub()뒤에 throws키워드 붙이자 try는 메인안에 sub()를 감싼다.

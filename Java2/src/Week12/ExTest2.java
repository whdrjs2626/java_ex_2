package Week12;

public class ExTest2 {
	public static void main(String[] args) {
		try {
			sub(); // 이 메소드 실행 중 예외가 발생했다면
		}
		catch(ArrayIndexOutOfBoundsException e) { // 그 예외가 배열의 인덱스 관련 오류라면 이 catch문이 실행됩니다.
			System.out.println(e.getMessage());
			System.out.println("배열의 최대 인덱스를 초과하여 접근했습니다.");
		}
	}
	public static void sub() throws ArrayIndexOutOfBoundsException { // 예외를 이 메소드를 호출한 곳에서 처리하게 하는 방식입니다.
		int[] array = new int[] {34, 56, 12, 87, 34, 78};
		System.out.println("array[array.length] : " + array[array.length]);
	}
}
// 예외 처리방법  1 직접 처리(try catch가 sub안에 있어야함) 2 throw로 던지기(sub()뒤에 throws키워드 붙이자 try는 메인안에 sub()를 감싼다.

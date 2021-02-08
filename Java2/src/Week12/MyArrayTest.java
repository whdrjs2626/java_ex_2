package Week12;

class MyArray <T> {
	private T[] t;
	MyArray(T[] t) { // 멤버 변수 t 배열을 초기화 해주는 생성자입니다.
		this.t = t;
	}
	
	T firstE() { // t의 맨 처음 원소를 리턴해줍니다.
		return t[0];
	}
	
	T lastE() { // t의 마지막 원소를 리턴해줍니다.
		return t[t.length-1];
	}
	
	void display() {
		for(T a : t) { // t의 원소들을 전부 출력합니다.
			System.out.print(a + "  ");
		}
		System.out.println();
	}
}

public class MyArrayTest {
	public static void main(String[] args) {
		
		MyArray<Integer> in = new MyArray<>(new Integer[] {5, 3, 9, 5, 2, 78, 45, 91}); // 생성자 매개변수로 무명 배열을 전달해줍니다.
		MyArray<Double> db = new MyArray<>(new Double[] {2.3, 1.2, 67.3, 45.2, 4.2, 66.4});
		MyArray<Character> ch = new MyArray<>(new Character[] {'d', 'r', 'q', 'y', 'p', 'b', 's'});
		
		System.out.println(" -- Integer 배열 원소 출력 -- ");
		in.display();
		System.out.println("\n -- Double 배열 원소 출력 -- ");
		db.display();
		System.out.println("\n -- Character 배열 원소 출력 -- ");
		ch.display();
		
		System.out.println("\n --- Integer 배열 첫번째와 마지막 원소 : " + in.firstE() + " / " + in.lastE());
		System.out.println(" --- Double 배열 첫번째와 마지막 원소 : " + db.firstE() + " / " + db.lastE());
		System.out.println(" --- Character 배열 첫번째와 마지막 원소 : " + ch.firstE() + " / " + ch.lastE());
	}
}

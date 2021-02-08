package Week12;

class MyArray <T> {
	private T[] t;
	MyArray(T[] t) { // ��� ���� t �迭�� �ʱ�ȭ ���ִ� �������Դϴ�.
		this.t = t;
	}
	
	T firstE() { // t�� �� ó�� ���Ҹ� �������ݴϴ�.
		return t[0];
	}
	
	T lastE() { // t�� ������ ���Ҹ� �������ݴϴ�.
		return t[t.length-1];
	}
	
	void display() {
		for(T a : t) { // t�� ���ҵ��� ���� ����մϴ�.
			System.out.print(a + "  ");
		}
		System.out.println();
	}
}

public class MyArrayTest {
	public static void main(String[] args) {
		
		MyArray<Integer> in = new MyArray<>(new Integer[] {5, 3, 9, 5, 2, 78, 45, 91}); // ������ �Ű������� ���� �迭�� �������ݴϴ�.
		MyArray<Double> db = new MyArray<>(new Double[] {2.3, 1.2, 67.3, 45.2, 4.2, 66.4});
		MyArray<Character> ch = new MyArray<>(new Character[] {'d', 'r', 'q', 'y', 'p', 'b', 's'});
		
		System.out.println(" -- Integer �迭 ���� ��� -- ");
		in.display();
		System.out.println("\n -- Double �迭 ���� ��� -- ");
		db.display();
		System.out.println("\n -- Character �迭 ���� ��� -- ");
		ch.display();
		
		System.out.println("\n --- Integer �迭 ù��°�� ������ ���� : " + in.firstE() + " / " + in.lastE());
		System.out.println(" --- Double �迭 ù��°�� ������ ���� : " + db.firstE() + " / " + db.lastE());
		System.out.println(" --- Character �迭 ù��°�� ������ ���� : " + ch.firstE() + " / " + ch.lastE());
	}
}

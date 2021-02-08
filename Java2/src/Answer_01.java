

public class Answer_01 {
	public static void main(String[] args) {
		int[] data = new int[10]; // int 배열 선언 & 생성
		init(data); // 난수로 배열 초기화

		System.out.println("------- 초기화 된 배열 출력 -----------");
		for (int temp : data)
			System.out.print(temp + "\t");
		System.out.println();

		System.out.println("------- 역순으로 출력 -----------");
		reverse(data);
	}

	static void init(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20);
		}
	}
	
	static void reverse(int[] arr) {
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
	}
}

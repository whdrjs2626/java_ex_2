package JAVA2;

public class Answer_01 {
	static void init(int[] arr) { // 배열을 난수로 초기화하는 함수
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 50); // 난수는 0~49까지 범위로 설정했습니다.
		}
	}
	
	static void reverse(int[] arr) { // 배열을 뒤집어서 출력하는 함수
		for(int i = arr.length-1; i >= 0; i--) { // 마지막 인덱스부터 감소시켜줬습니다.
			System.out.print(arr[i] + "\t");
		}
	}

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
}

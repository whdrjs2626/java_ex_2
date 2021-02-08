package JAVA2;
import java.util.Scanner;

public class Answer_03 {
    static boolean search(int[] arr, int a) { // 예약 확인 메소드
    	if(arr[a] == 1) return false; // 예약하려는 자리가 1이면(이미 예약되어 있으면) false를 리턴해줍니다.
    	else { // 예약하려는 자리가 0이면(비어있으면) true를 리턴해줍니다.
    		arr[a] = 1;
    		return true;
    	}
    }
    
    static void display(int[] arr) { // 예약 현황을 출력하는 메소드
    	for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + " : " + arr[i] + "\t");
    	}
		System.out.println();
    }
    
	public static void main(String[] args) {
		int[] seat = { 0, 0, 1, 0, 1, 1, 0, 0, 1, 0 }; // 1:예약된 좌석, 0:예약가능한 좌석
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("좌석 번호를 입력하세요(종료는 0) >> ");
			int number = in.nextInt();
			if (number <= 0)
				break;
			if (search(seat, number - 1))
				System.out.println("예약 완료");
			else
				System.out.println("예약 불가 : 예약된 좌석");

			System.out.println("---------- 예약 현황 -----------");
			display(seat);
		}
	}
}

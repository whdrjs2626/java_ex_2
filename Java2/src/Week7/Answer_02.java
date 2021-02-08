package Week7;

import java.util.Scanner;

abstract class Media {
	abstract void play(String instru); // 재생

	abstract void stop(String instru); // 정지
}

public class Answer_02 {
	
	public static void run(Media media, String str) { 
		media.play(str);
		media.stop(str);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Media media = new Media() { // Media 클래스를 상속받는 익명 자식 객체 구현
			void play(String instru) {
				System.out.println(instru + "를 재생합니다");
			}

			void stop(String instru) {
				System.out.println(instru + "를 정지합니다");
			}
		};

		String[] Player = { "MP3", "CDPlay", "WindowMediaPlay" };

		System.out.print("기기를 선택하세요. \n1 : " + Player[0] + "  2 : " + Player[1] + "  3 : " + Player[2] + " >> ");
		int a = in.nextInt();

		if (a > 3) {
			System.out.println("잘못된 입력입니다.");
		} else {
			run(media, Player[--a]);
		}

		in.close();
	}
}

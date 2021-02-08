package Week7;

import java.util.Scanner;

abstract class Media {
	abstract void play(String instru); // ���

	abstract void stop(String instru); // ����
}

public class Answer_02 {
	
	public static void run(Media media, String str) { 
		media.play(str);
		media.stop(str);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Media media = new Media() { // Media Ŭ������ ��ӹ޴� �͸� �ڽ� ��ü ����
			void play(String instru) {
				System.out.println(instru + "�� ����մϴ�");
			}

			void stop(String instru) {
				System.out.println(instru + "�� �����մϴ�");
			}
		};

		String[] Player = { "MP3", "CDPlay", "WindowMediaPlay" };

		System.out.print("��⸦ �����ϼ���. \n1 : " + Player[0] + "  2 : " + Player[1] + "  3 : " + Player[2] + " >> ");
		int a = in.nextInt();

		if (a > 3) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else {
			run(media, Player[--a]);
		}

		in.close();
	}
}

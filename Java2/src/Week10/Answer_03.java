package Week10;

import java.util.Scanner;

public class Answer_03 {
	static Scanner in = new Scanner(System.in);
	
	public static void game(String[] str) {
		System.out.println("--- �����ձ� ������ �����ϰڽ��ϴ�!! ---");
		String word = str[(int) (Math.random()*str.length)]; // ������ �߻����� str�� �ε����� ����մϴ�. -> �ܾ� �� ������ �ܾ ���ɴϴ�. 
		while(true) {
			System.out.print(word + "�� " + word.charAt(word.length()-1) + "�� �����ϴ� �ܾ� >> "); // �������� ���� �ܾ��� ������ �ܾ�
			String word2 = in.next(); // �����ձ��� ���� �ܾ�
			if(word.charAt(word.length()-1) == word2.charAt(0)) { // ������ ù���� ������?
				word = word2; // ������ ���� �ܾ�� word�� �ʱ�ȭ ���ݴϴ�.
			}
			else { // ������ ù���� �ٸ��� ����
				System.out.println("Ʋ�Ƚ��ϴ�.");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		String[] words = {"����", "����", "����", "�Ѹ�", "�ݺ���", "������", "��ǻ��", "�ڹ�", "����", "�����"};
		char ch;
		do {
			game(words);
			System.out.print("����Ͻðڽ��ϱ� ? >>> ");
			ch = in.next().charAt(0); // c�� �Է��ؾ� ������ �ٽ� ������ �� �ֽ��ϴ�.
		} while(ch == 'c');
		System.out.println("������ �����մϴ�."); // c �̿��� �ܾ� �Է� �� ���� �����մϴ�.
	}
}

package Week10;

import java.util.Scanner;

public class Answer_03 {
	static Scanner in = new Scanner(System.in);
	
	public static void game(String[] str) {
		System.out.println("--- 끝말잇기 게임을 시작하겠습니다!! ---");
		String word = str[(int) (Math.random()*str.length)]; // 난수를 발생시켜 str의 인덱스로 사용합니다. -> 단어 중 랜덤한 단어가 나옵니다. 
		while(true) {
			System.out.print(word + "의 " + word.charAt(word.length()-1) + "로 시작하는 단어 >> "); // 랜덤으로 나온 단어의 마지막 단어
			String word2 = in.next(); // 끝말잇기의 다음 단어
			if(word.charAt(word.length()-1) == word2.charAt(0)) { // 끝말과 첫말이 같은가?
				word = word2; // 같으면 다음 단어로 word를 초기화 해줍니다.
			}
			else { // 끝말과 첫말이 다르면 오답
				System.out.println("틀렸습니다.");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		String[] words = {"생각", "지금", "수학", "한림", "금병산", "도서관", "컴퓨터", "자바", "물병", "음료수"};
		char ch;
		do {
			game(words);
			System.out.print("계속하시겠습니까 ? >>> ");
			ch = in.next().charAt(0); // c를 입력해야 게임을 다시 시작할 수 있습니다.
		} while(ch == 'c');
		System.out.println("게임을 종료합니다."); // c 이외의 단어 입력 시 게임 종료합니다.
	}
}

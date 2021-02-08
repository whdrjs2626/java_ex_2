package Week11;
class CharThread extends Thread {
	private char[] ch; // 전용멤버
	private int num; 
	
	public CharThread(char[] ch, int num) { // ch와 num을 초기화하는 생성자
		this.ch = ch;
		this.num = num;
	}
	@Override
	public void run() {
		try {
			for(int i = 0; i < num; i++) {
				System.out.print(ch[i%2]); // 난수만큼 문자를 번갈아 가며 출력합니다.
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {}
	}
}
class NumThread extends Thread {
	private int num; // 전용멤버
	
	public NumThread(int num) { // num을 초기화하는 생성자
		this.num = num;
	}
	
	public void run() {
		try {
			for(int i = 1; i <= num; i++) {
				System.out.print(i); // 난수만큼 숫자를 출력합니다.
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {}
	}
}
public class ThreadCharNum {
	public static void main(String[] args) {
		int num = (int)(Math.random()*21+1);
		Thread cht = new CharThread(new char[] {'◇', '□'}, num);
		Thread nut = new NumThread(num);
		cht.start();
		nut.start();
	}
}

package Week11;
class CharThread extends Thread {
	private char[] ch; // ������
	private int num; 
	
	public CharThread(char[] ch, int num) { // ch�� num�� �ʱ�ȭ�ϴ� ������
		this.ch = ch;
		this.num = num;
	}
	@Override
	public void run() {
		try {
			for(int i = 0; i < num; i++) {
				System.out.print(ch[i%2]); // ������ŭ ���ڸ� ������ ���� ����մϴ�.
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {}
	}
}
class NumThread extends Thread {
	private int num; // ������
	
	public NumThread(int num) { // num�� �ʱ�ȭ�ϴ� ������
		this.num = num;
	}
	
	public void run() {
		try {
			for(int i = 1; i <= num; i++) {
				System.out.print(i); // ������ŭ ���ڸ� ����մϴ�.
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {}
	}
}
public class ThreadCharNum {
	public static void main(String[] args) {
		int num = (int)(Math.random()*21+1);
		Thread cht = new CharThread(new char[] {'��', '��'}, num);
		Thread nut = new NumThread(num);
		cht.start();
		nut.start();
	}
}

package Week2;

import java.util.*;
class Box {
	private int ga, se, he; // ����, ����, ���� ����
	private int volume; // ���� ����
	private int num; // ������ ���� ����
	private static int cnt = 1; //������ ������ �����ϴ� ���� �ʵ�
	
	public Box() {
		this(0, 0, 0); // �����ε� �� ������ ȣ��, �׻� ù ���忡 �ۼ�
	}
	public Box(int ga, int se, int he) { // ������
		this.ga = ga;
		this.se = se;
		this.he = he;
		volume = ga * se * he; // �����ڿ��� ���� ���
		num = cnt++; // �����ڷ� ����� �� ������ cnt(������ ����) ����
	}
	public int getVolume() { // ������ ���� �޼ҵ�
		return volume;
	}
	public String toString() { // ��� �޼ҵ�
		String str = "���� : " + ga + "\t���� : " + se + "\t���� : " + he;
		str += "\t���� : " + volume + "\t���� ��ȣ : " + num;
		return str;
	}
	public boolean isSame(Box obj) { // ���ǰ� ������ Ȯ���ϴ� �޼ҵ�
		if(ga == obj.ga && se == obj.se && he == obj.he)
			return true;
		else
			return false;
	}
}

class BoxControl {
	public static Box isMax(Box[] dim) {
		Box max = dim[0]; // �ִ� ���Ǹ� ���� �ڽ��� �迭 dim�� 0��° �ڽ��� �ʱ�ȭ
		for(int i = 1; i < dim.length; i++) {
			if(max.getVolume() < dim[i].getVolume()) 
				max = dim[i]; // max ���� ū ���Ǹ� ���� �ڽ��� max�� �ʱ�ȭ 
		}
		return max;
	}
	public static void write(Box[] dim) {
		System.out.println("\n    >> ��ü ���� ��� << ");
		for(Box temp : dim) // dim�� ��ҵ��� temp�� �ϳ��� ��� ���
			System.out.println(temp);
	}
}
public class MaxBox {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Box[] obj = new Box[5];
		
		for(int i = 0; i < obj.length; i++) {
			System.out.print((i + 1) + "��) ����, ����, ���̸� �Է��Ͻÿ� : ");
			obj[i] = new Box(in.nextInt(), in.nextInt(), in.nextInt());
		}
		
		BoxControl.write(obj);
		System.out.println("\n  >> ���ǰ� ���� ū �ڽ� << \n" + BoxControl.isMax(obj));
	}
}

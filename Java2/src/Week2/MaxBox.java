package Week2;

import java.util.*;
class Box {
	private int ga, se, he; // 가로, 세로, 높이 변수
	private int volume; // 부피 변수
	private int num; // 생성된 순서 저장
	private static int cnt = 1; //생성된 순서를 저장하는 정적 필드
	
	public Box() {
		this(0, 0, 0); // 오버로딩 된 생성자 호출, 항상 첫 문장에 작성
	}
	public Box(int ga, int se, int he) { // 생성자
		this.ga = ga;
		this.se = se;
		this.he = he;
		volume = ga * se * he; // 생성자에서 부피 계산
		num = cnt++; // 생성자로 만들어 질 때마다 cnt(생성된 순서) 증가
	}
	public int getVolume() { // 부피의 게터 메소드
		return volume;
	}
	public String toString() { // 출력 메소드
		String str = "가로 : " + ga + "\t세로 : " + se + "\t높이 : " + he;
		str += "\t부피 : " + volume + "\t생성 번호 : " + num;
		return str;
	}
	public boolean isSame(Box obj) { // 부피가 같은지 확인하는 메소드
		if(ga == obj.ga && se == obj.se && he == obj.he)
			return true;
		else
			return false;
	}
}

class BoxControl {
	public static Box isMax(Box[] dim) {
		Box max = dim[0]; // 최대 부피를 갖는 박스를 배열 dim의 0번째 박스로 초기화
		for(int i = 1; i < dim.length; i++) {
			if(max.getVolume() < dim[i].getVolume()) 
				max = dim[i]; // max 보다 큰 부피를 갖는 박스를 max로 초기화 
		}
		return max;
	}
	public static void write(Box[] dim) {
		System.out.println("\n    >> 객체 내용 출력 << ");
		for(Box temp : dim) // dim의 요소들을 temp에 하나씩 담아 출력
			System.out.println(temp);
	}
}
public class MaxBox {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Box[] obj = new Box[5];
		
		for(int i = 0; i < obj.length; i++) {
			System.out.print((i + 1) + "번) 가로, 세로, 높이를 입력하시오 : ");
			obj[i] = new Box(in.nextInt(), in.nextInt(), in.nextInt());
		}
		
		BoxControl.write(obj);
		System.out.println("\n  >> 부피가 가장 큰 박스 << \n" + BoxControl.isMax(obj));
	}
}

package Week14;

import java.io.*;
import java.util.*;

class Pet implements Serializable { // 직렬화를 위한 인터페이스 구현
	private String name;
	private int age;
	private double weight;
	
	public Pet(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String toString() {
		return "이름 : " + name + "  나이 : " + age + "  몸무게 : " + weight;
	}
}

public class Lec_04 { // 객체 입출력 보조 스트림
	public static void main(String[] args) throws Exception {
		writeList();
		List<Pet> list = readList();
		for(Pet obj : list) {
			System.out.println(obj);
		}
	}

    static List<Pet> readList() throws Exception {
    	ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat")); // ObjectInputStream이 역직렬화 함
    	@SuppressWarnings("unchecked") // 타입 체킹이 안전하기에 체크할 필요가 없다라는 표시를 해두는 어노테이션 -> 내가 아래에 (List <Pet>)으로 타입 형변환 완벽하게 했으니 걱정마라
    	List<Pet> list = (List<Pet>)in.readObject(); // 원래 객체의 타입 List<Pet>으로 강제 형변환 해줘야 Pet클래스의 필드 사용 가능
    	in.close();
    	return list;
    }

    static void writeList() throws Exception {
    	List<Pet> list = new ArrayList<>(); // ArrayList객체와 Pet객체가 파일에 저장된다. 직렬화필수
    	ObjectOutputStream out = null;
    	list.add(new Pet("해바라기", 7, 10.2));
    	list.add(new Pet("금강초롱", 4, 4.2));
    	
    	out = new ObjectOutputStream(new FileOutputStream("object.dat"));
    	out.writeObject(list);
    	out.flush();
    	out.close();
    }

}

package Week14;

import java.io.*;
import java.util.*;

class Pet implements Serializable { // ����ȭ�� ���� �������̽� ����
	private String name;
	private int age;
	private double weight;
	
	public Pet(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String toString() {
		return "�̸� : " + name + "  ���� : " + age + "  ������ : " + weight;
	}
}

public class Lec_04 { // ��ü ����� ���� ��Ʈ��
	public static void main(String[] args) throws Exception {
		writeList();
		List<Pet> list = readList();
		for(Pet obj : list) {
			System.out.println(obj);
		}
	}

    static List<Pet> readList() throws Exception {
    	ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat")); // ObjectInputStream�� ������ȭ ��
    	@SuppressWarnings("unchecked") // Ÿ�� üŷ�� �����ϱ⿡ üũ�� �ʿ䰡 ���ٶ�� ǥ�ø� �صδ� ������̼� -> ���� �Ʒ��� (List <Pet>)���� Ÿ�� ����ȯ �Ϻ��ϰ� ������ ��������
    	List<Pet> list = (List<Pet>)in.readObject(); // ���� ��ü�� Ÿ�� List<Pet>���� ���� ����ȯ ����� PetŬ������ �ʵ� ��� ����
    	in.close();
    	return list;
    }

    static void writeList() throws Exception {
    	List<Pet> list = new ArrayList<>(); // ArrayList��ü�� Pet��ü�� ���Ͽ� ����ȴ�. ����ȭ�ʼ�
    	ObjectOutputStream out = null;
    	list.add(new Pet("�عٶ��", 7, 10.2));
    	list.add(new Pet("�ݰ��ʷ�", 4, 4.2));
    	
    	out = new ObjectOutputStream(new FileOutputStream("object.dat"));
    	out.writeObject(list);
    	out.flush();
    	out.close();
    }

}

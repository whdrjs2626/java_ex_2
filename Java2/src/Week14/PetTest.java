package Week14;

import java.io.*;
import java.util.*;

class Pet2 implements Serializable {
	private String name; // �̸�
	private int age; // ����
	private double weight;// ������

	public Pet2(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String toString() {
		return "Name = " + name + "  " + "Age = " + age + "  " + "Weight = " + weight;
	}
}

public class PetTest {
	public static void main(String[] args) throws Exception {
		writeList();
		List<Pet2> list = readList();
		for (Pet2 obj : list)
			System.out.println(obj);
	}

	public static List<Pet2> readList() throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"));
		@SuppressWarnings("unchecked")
		List<Pet2> list = (List<Pet2>) in.readObject();
		in.close();
		return list;
	}

	public static void writeList() throws Exception {
		List<Pet2> list = new ArrayList<>();
		ObjectOutputStream out = null;
		list.add(new Pet2("�عٶ��", 7, 10.2));
		list.add(new Pet2("�ݰ��ʷ�", 4, 4.2));

		// FileOutputStream ��ü�� �����Ͽ� ���: �����͸� ���Ͽ� �����ϴ� ����� ���� ����
		out = new ObjectOutputStream(new FileOutputStream("object.dat"));
		out.writeObject(list);
		out.flush();
		out.close();
	}
}

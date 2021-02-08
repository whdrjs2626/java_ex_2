package Week14;

import java.io.*;
import java.util.*;

class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name; // å�� �̸� ��� ����
	private String author; // ���� �̸� ��� ���� 

	public String getAuthor() { // ���� �̸� ������
		return author;
	}

	public Book(String name, String author) { // ������
		this.name = name; 
		this.author = author;
	}

	public void disPlay() { // ��ü ��� �޼ҵ�
		System.out.print("������ : " + name);
		System.out.println("\t���ڸ� : " + author);
	}
}
class Manage {

	public void print(List<Book> list) {
		for(int i = 0; i < list.size(); i++) {
			list.get(i).disPlay();
		}
	}
    public void search(List<Book> list, Scanner in) {
    	System.out.println("dlqfur : ");
    	String str = in.next();
    	if(list.contains(str)) {
    		list.get(list.indexOf(str)).disPlay();
    	}
    	else {
    		System.out.println();
    	}
    }
	static List<Book> read() throws Exception {
    	ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat")); // ObjectInputStream�� ������ȭ ��
    	@SuppressWarnings("unchecked") // Ÿ�� üŷ�� �����ϱ⿡ üũ�� �ʿ䰡 ���ٶ�� ǥ�ø� �صδ� ������̼� 
    	List<Book> list = (List<Book>)in.readObject(); // ���� ��ü�� Ÿ�� List<Book>���� ���� ����ȯ ����� BookŬ������ �ʵ� ��� ����
    	in.close();
    	return list; // ���Ͽ��� �о�� ��ü�� �������ݴϴ�. 
    }
	
	static void write(List<Book> list) throws Exception {
    	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
    	out.writeObject(list);
    	out.flush();
    	out.close();
    }
	
	public Book push(Scanner in) {
		Book log = new Book("qkrwhdrjs", "whdrjs");
		return log;
	}
}
public class Answer_03 {
	public static void main(String[] args) throws Exception {
		/*List<Book> list = new ArrayList<>();
		try {
			list = readList(); // ���Ͽ� ����� ArrayList��ü�� ������ �����մϴ�.
			System.out.println("--- ���Ͽ� ����� ���� ����մϴ�. ---");
			for(Book obj : list) {
				obj.disPlay(); // ���
			}
			System.out.println();
		} catch(IOException e) { // ���� ��ü�� ���� �� ���ܰ� �߻��մϴ�.
			System.out.println("����� ���� �����ϴ�.\n");
		}
		writeList(list); // ���α׷� ���� ���� Book ��ü�� ����� list�� ���Ͽ� �������ݴϴ�.
		*/
		List<Book> list2 = null;
		Scanner key = new Scanner(System.in);
		Manage mg = new Manage();
		Book log = null;
		list2 = mg.read();
		while(true) {
			System.out.println("1,23");
			int answer = key.nextInt();
			if(answer == 4) break;
			switch(answer) {
			case 1: log = mg.push(key); list2.add(log); break;
			case 2: mg.search(list2, key); break;
			case 3: mg.print(list2);
			}
		}

		System.out.println("all");
		mg.write(list2);
		key.close();
	}
    static List<Book> readList() throws Exception {
    	ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat")); // ObjectInputStream�� ������ȭ ��
    	@SuppressWarnings("unchecked") // Ÿ�� üŷ�� �����ϱ⿡ üũ�� �ʿ䰡 ���ٶ�� ǥ�ø� �صδ� ������̼� 
    	List<Book> list = (List<Book>)in.readObject(); // ���� ��ü�� Ÿ�� List<Book>���� ���� ����ȯ ����� BookŬ������ �ʵ� ��� ����
    	in.close();
    	return list; // ���Ͽ��� �о�� ��ü�� �������ݴϴ�. 
    }

    static void writeList(List<Book> list) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int a = 1;
    	while(a != -1) {
    		System.out.print("������ , ���ڸ� �Է��ϼ��� : ");
    		list.add(new Book(sc.next(), sc.next())); // �о�� ��ü�� ���� ������ ��ü�� �߰����ݴϴ�. 
    		System.out.print("�� �̻� ����Ʈ�� ������ ������ ������ -1 �Է� : ");
    		a = sc.nextInt();
    	}
    	System.out.println("����Ʈ�� ������ �����մϴ�.");
    	// ������ �о�� ��ü�� �����ϰ� �� ��ü�� �ٽ� ���Ͽ� �������ִ� ���̹Ƿ� ������� �ʰ� �߰����ֱ� ���� true���ڴ� ���� �ʾҽ��ϴ�. 
    	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
    	out.writeObject(list);
    	out.flush();
    	out.close();
    }
}

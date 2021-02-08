package week6;
interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
}
class OracleDB implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	@Override
	public void insert() {
		System.out.println("Oracle DB��    ����");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB��    ����");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}
}

class MySqlDB implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("MySql  DB���� �˻�");
	}
	@Override
	public void insert() {
		System.out.println("MySql  DB��    ����");
	}
	@Override
	public void update() {
		System.out.println("MySql  DB��    ����");
	}
	@Override
	public void delete() {
		System.out.println("MySql  DB���� ����");
	}
}
public class Answer_05 {
	public static void dbWork(DataAccessObject db) {
		db.select();
		db.insert();
		db.update();
		db.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDB());
		dbWork(new MySqlDB());
	}
}

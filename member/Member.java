public class Member{
	String name;
	String id;
	String password;
	int age;
	
	Member(String name) {
		this(name, null, null, 0);
	}
	Member(String name, String password) {
		this(name, null, password, 0);
		}
	Member(String name, String id, String password) {
		this(name, id, password, 0);
	}
	Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	void displayMember() {
		System.out.println("�̸�:" + name + "\n" + "ID:" + id + "\n" + "��й�ȣ:"
							+ password + "\n" + "����:" + age);
		System.out.println("=============================");
	}
	
	boolean login(String id, String password) {
		if (this.id.equals(id) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
		
			
	}
	
	
}








import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member[] user = new Member[4];
		//��ü1
		System.out.println("user1�� �̸��� �Է��ϼ���.");
		System.out.print(">");
		String name1 = scanner.next();
		user[0] = new Member(name1);
		
		//��ü2
		System.out.println("user2�� �̸��� �Է��ϼ���.");
		System.out.print(">");
		String name2 = scanner.next();
		System.out.println("user2�� ��й�ȣ�� �Է��ϼ���.");
		System.out.print(">");
		String password2 = scanner.next();
		user[1] = new Member(name2,password2);
		
		//��ü3
		System.out.println("user3�� �̸��� �Է��ϼ���.");
		System.out.print(">");
		String name3 = scanner.next();
		System.out.println("user3�� id�� �Է��ϼ���.");
		System.out.print(">");
		String id3 = scanner.next();
		System.out.println("user3�� ��й�ȣ�� �Է��ϼ���.");
		System.out.print(">");
		String password3 = scanner.next();
		user[2] = new Member(name3,id3,password3);
		
		//��ü4
		System.out.println("user4�� �̸��� �Է��ϼ���.");
		System.out.print(">");
		String name4 = scanner.next();
		System.out.println("user4�� id�� �Է��ϼ���.");
		System.out.print(">");
		String id4 = scanner.next();
		System.out.println("user4�� ��й�ȣ�� �Է��ϼ���.");
		System.out.print(">");
		String password4 = scanner.next();
		System.out.println("user4�� ���̸� �Է��ϼ���.");
		System.out.print(">");
		int age4 = scanner.nextInt();
		user[3] = new Member(name4,id4,password4,age4);

		//�� ��ü�� ��Ȯ�� (�ʱⰪȮ��)
		for(int i=0; i<user.length; i++) {
			user[i].displayMember();
		}
		//��ü1 �ϼ�
		System.out.println("===================");
		System.out.println("User1�� ���� �Է��Դϴ�.");
		
		System.out.println("id�� �Է��ϼ���.");
		System.out.print(">");
		String id1 = scanner.next();
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		System.out.print(">");
		String password1 = scanner.next();
		System.out.println("���̸� �Է��ϼ���.");
		System.out.print(">");
		int age1 = scanner.nextInt();
		user[0].id = id1;
		user[0].password = password1;
		user[0].age = age1;
		
		//��ü2 �ϼ�
		System.out.println("===================");
		System.out.println("User2�� ���� �Է��Դϴ�.");
		
		System.out.println("id�� �Է��ϼ���.");
		System.out.print(">");
		String id2 = scanner.next();
		System.out.println("���̸� �Է��ϼ���.");
		System.out.print(">");
		int age2 = scanner.nextInt();
		user[1].id = id2;
		user[1].age = age2;
		
		//��ü3 �ϼ�
		System.out.println("===================");
		System.out.println("User3�� ���� �Է��Դϴ�."); 
		
		System.out.println("���̸� �Է��ϼ���.");
		System.out.print(">");
		int age3 = scanner.nextInt();
		user[2].age = age3;
		
		//������ �� ä��� ���
		for(int i=0; i<user.length; i++) {
			user[i].displayMember();
		}
		
		//login�޼ҵ� �Ű������Է�
		System.out.println("===�α��� �Է�â�Դϴ�===");
		System.out.println("ID�� �Է��ϼ���.");
		System.out.print(">");
		String id = scanner.next();
		
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		System.out.print(">");
		String password = scanner.next();
		
		//�� ��ü�� login�޼ҵ� ȣ��
		for(int i = 0; i<user.length; i++ ) {
			Boolean result = user[i].login(id, password);
			
			if(result) {
				System.out.println("===========================");
				System.out.println(id + "�α��� ����");
			} else {
				System.out.println("===========================");
				System.out.println(id + "�α��� ����, �ٽ� �õ��ϼ���.");
			}
		}	
	}
	
}
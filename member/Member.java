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
		System.out.println("이름:" + name + "\n" + "ID:" + id + "\n" + "비밀번호:"
							+ password + "\n" + "나이:" + age);
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
		//객체1
		System.out.println("user1의 이름을 입력하세요.");
		System.out.print(">");
		String name1 = scanner.next();
		user[0] = new Member(name1);
		
		//객체2
		System.out.println("user2의 이름을 입력하세요.");
		System.out.print(">");
		String name2 = scanner.next();
		System.out.println("user2의 비밀번호를 입력하세요.");
		System.out.print(">");
		String password2 = scanner.next();
		user[1] = new Member(name2,password2);
		
		//객체3
		System.out.println("user3의 이름을 입력하세요.");
		System.out.print(">");
		String name3 = scanner.next();
		System.out.println("user3의 id를 입력하세요.");
		System.out.print(">");
		String id3 = scanner.next();
		System.out.println("user3의 비밀번호를 입력하세요.");
		System.out.print(">");
		String password3 = scanner.next();
		user[2] = new Member(name3,id3,password3);
		
		//객체4
		System.out.println("user4의 이름을 입력하세요.");
		System.out.print(">");
		String name4 = scanner.next();
		System.out.println("user4의 id를 입력하세요.");
		System.out.print(">");
		String id4 = scanner.next();
		System.out.println("user4의 비밀번호를 입력하세요.");
		System.out.print(">");
		String password4 = scanner.next();
		System.out.println("user4의 나이를 입력하세요.");
		System.out.print(">");
		int age4 = scanner.nextInt();
		user[3] = new Member(name4,id4,password4,age4);

		//각 객체의 값확인 (초기값확인)
		for(int i=0; i<user.length; i++) {
			user[i].displayMember();
		}
		//객체1 완성
		System.out.println("===================");
		System.out.println("User1의 정보 입력입니다.");
		
		System.out.println("id를 입력하세요.");
		System.out.print(">");
		String id1 = scanner.next();
		System.out.println("비밀번호를 입력하세요.");
		System.out.print(">");
		String password1 = scanner.next();
		System.out.println("나이를 입력하세요.");
		System.out.print(">");
		int age1 = scanner.nextInt();
		user[0].id = id1;
		user[0].password = password1;
		user[0].age = age1;
		
		//객체2 완성
		System.out.println("===================");
		System.out.println("User2의 정보 입력입니다.");
		
		System.out.println("id를 입력하세요.");
		System.out.print(">");
		String id2 = scanner.next();
		System.out.println("나이를 입력하세요.");
		System.out.print(">");
		int age2 = scanner.nextInt();
		user[1].id = id2;
		user[1].age = age2;
		
		//객체3 완성
		System.out.println("===================");
		System.out.println("User3의 정보 입력입니다."); 
		
		System.out.println("나이를 입력하세요.");
		System.out.print(">");
		int age3 = scanner.nextInt();
		user[2].age = age3;
		
		//부족한 값 채운뒤 출력
		for(int i=0; i<user.length; i++) {
			user[i].displayMember();
		}
		
		//login메소드 매개변수입력
		System.out.println("===로그인 입력창입니다===");
		System.out.println("ID를 입력하세요.");
		System.out.print(">");
		String id = scanner.next();
		
		System.out.println("비밀번호를 입력하세요.");
		System.out.print(">");
		String password = scanner.next();
		
		//각 객체의 login메소드 호출
		for(int i = 0; i<user.length; i++ ) {
			Boolean result = user[i].login(id, password);
			
			if(result) {
				System.out.println("===========================");
				System.out.println(id + "로그인 성공");
			} else {
				System.out.println("===========================");
				System.out.println(id + "로그인 실패, 다시 시도하세요.");
			}
		}	
	}
	
}
package sub2;

/*
 * 날짜 : 2020/11/09
 * 이름 : 김철학
 * 내용 : 자바 클래스 실습하기 교재 p140
 */
public class ClassTest {
	public static void main(String[] args) {
		
		// 국민은행 객체(Instance)생성 및 초기화
		Account kb = new Account("국민은행", "121-11-1234", "김유신", 10000);
		
		// 국민은행 객체 활용하기
		kb.deposit(15000);
		
		// 캡슐화 적용으로 취약코드 예방
		//kb.money++; 
		
		kb.withdraw(5000);
		kb.show();
		
		// 우리은행 객체(Instance)생성 및 초기화
		Account wr = new Account("우리은행", "121-12-1234", "김춘추", 5000);
		
		// 우리은행 객체 활용하기
		wr.deposit(10000);
		wr.withdraw(7000);
		
		// 캡슐화 적용으로 취약코드 예방
		//wr.money--;
		
		wr.show();
		
	}
}

package sub2;

/*
 * 날짜 : 2020/11/10
 * 이름 : 김철학
 * 내용 : 클래스 상속 실습하기 교재 p196
 */
public class InheritanceTest {
	public static void main(String[] args) {
		
		Student std = new Student("김유신", 23, "부경대", "컴퓨터공학");
		std.hello();
		
		SalaryStudent sstd 
			= new SalaryStudent("이순신", 32, "부산대", "빅데이터", "삼성");
		sstd.hello();
	}
}

package sub3;

/*
 * 날짜 : 2020/11/16
 * 이름 : 김철학
 * 내용 : 예외 떠넘기기(던지기) 실습하기 교재 p273
 */
public class ThrowsTest {

	public static void main(String[] args)  {
		
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 2);
		int r2 = cal.minus(2, 3);
		int r3 = cal.multi(3, 4);
		int r4 = 0;
		try {
			r4 = cal.div(4, -1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("프로그램 종료...");
	}
}





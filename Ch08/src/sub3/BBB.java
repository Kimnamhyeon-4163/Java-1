package sub3;

// final 클래스로 선언하면 더 이상 상속을 할 수 없다.
public class BBB extends AAA {
	
	@Override
	public final void method1() {
		System.out.println("BBB - method1...");
	}
	
	public void method2(int a) {
		System.out.println("BBB - method2...");
	}
	
	public void method3() {
		System.out.println("BBB - method3...");
	}
}

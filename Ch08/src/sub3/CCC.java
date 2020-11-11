package sub3;

public class CCC extends BBB {
	
	/*
	부모클래스 BBB의 method1에 final 선언으로 Override를 할 수 없다. 
	@Override
	public void method1() {
		System.out.println("CCC - method1...");
	}
	*/
	
	@Override
	public void method2() {
		System.out.println("CCC - method2...");
	}
	
	@Override
	public void method3(int a) {
		System.out.println("CCC - method3...");
	}
}

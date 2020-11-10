package test02;

import java.util.Scanner;

public class JavaTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("input ÀÔ·Â : ");
		
		input = sc.nextInt();
		
		int result = (1 + 2) * input;
		
		System.out.println("(1 + 2) x input = "+result);
		
		String name;
		System.out.print("name ÀÔ·Â : ");
		
		name = sc.next();
		String hello = "¾È³ç! "+name+"´Ô ¹Ý°©½À´Ï´Ù.";
		
		System.out.println(hello);
	}
}









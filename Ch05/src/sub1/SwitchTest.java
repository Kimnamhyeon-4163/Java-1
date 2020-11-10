package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2020/11/03
 * 이름 : 김철학
 * 내용 : 조건문 Switch 실습하기 교재 p86
 */
public class SwitchTest {
	public static void main(String[] args) {
		
		// 짝수, 홀수 판별하기
		int num = 4;
		int result = num % 2; 
		
		switch(result) {
		case 0:
			System.out.println("num은 짝수 입니다.");
			break;
		case 1:
			System.out.println("num은 홀수 입니다.");
			break;		
		}

		// 연습문제
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		
		int score = sc.nextInt();
		System.out.println("입력 점수 : "+score);
		
		int rs = score / 10;
		
		switch (rs) {
		case 10:
		case 9:
			System.out.println("A 입니다.");
			break;
		case 8:
			System.out.println("B 입니다.");
			break;
		case 7:
			System.out.println("C 입니다.");
			break;
		case 6:
			System.out.println("D 입니다.");
			break;
		default:
			System.out.println("F 입니다.");
			break;
		}
	}
}

package sub1;

/**
 * 날짜 : 2020/11/04
 * 이름 : 김철학
 * 내용 : 배열 실습하기 교재 p108 
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// 변수(Variable)
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// 배열(Array)
		int[] nums = {1, 2, 3, 4, 5};
		
		// 배열의 길이
		System.out.println("배열 nums의 길이 : "+nums.length);
		
		// 배열 원소 출력
		System.out.println("배열 nums의 1번째 원소 : "+nums[0]);
		System.out.println("배열 nums의 2번째 원소 : "+nums[1]);
		System.out.println("배열 nums의 3번째 원소 : "+nums[2]);
		System.out.println("배열 nums의 4번째 원소 : "+nums[3]);
		System.out.println("배열 nums의 5번째 원소 : "+nums[4]);
		
		for(int i=0 ; i<nums.length ; i++) {
			System.out.println("배열 nums["+i+"] : "+nums[i]);
		}
		
		// 배열 반복문
		for(int num : nums) {
			System.out.println("배열 nums의 원소 : "+num);
		}
	
		// 확인문제
		String person1 = "김유신";
		String person2 = "김춘추";
		String person3 = "장보고";
		String person4 = "강감찬";
		String person5 = "이순신";
		
		String[] people = {"김유신", "김춘추", "장보고", "강감찬", "이순신"};
		
		for(String person : people) {
			System.out.println("배열 people 원소 : "+person);
		}
		
		
	}
}








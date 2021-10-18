package sample1;

public class Hello {

	public static void main(String[] args) {
		// 출력예
		//첫번째 프로그램 입니다.
		//줄을 바꾸어 출력합니다.
		//여기까지 출력하고
		//줄을 바꿉니다.
		
		int age = 10;
		
		System.out.println("첫 번째 프로그램 입니다.");
		System.out.println("바꾸어 출력합니다.");
		System.out.println("출력" + 4 + "하고");
		System.out.println("바꿉니다.");
		
		System.out.println("출력하고\n바꿉니다.");
		
		//지시자
		/*
		 * %d   :  10진수 정수 표현
		 * %f   :  실수
		 * %c   :  문자 출력
		 * %s   :  문자열 출력
		 */
		// 출력예 : 나의 나이는 10살 입니다.
		System.out.printf("나의 나이는 %d살 입니다.", age);
		//출력예 : 나의 나이는 10살이고 10년 뒤에는 20살이 됩니다.
		System.out.printf("\n나의 나이는 %d살이고 %d년 뒤에는 %d살이 됩니다.", 
				age, 10, age + 10);
		String name = "bk";
		//출력예 : 나의 이름은 ooo이고, 나이는 10살입니다.
		//printf 와 변수 이용
		System.out.printf("\n나의 이름은 %s이고 나이는 %d살 입니다.", 
				name, 10);
		
		

	}

}

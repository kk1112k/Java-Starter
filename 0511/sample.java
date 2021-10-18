package sample1;
import java.util.*;

public class sample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		// switch문 사용
		/*
		 * 아래에 메뉴를 보여주고 선택한 메뉴를 알려주는 프로그램 작성.
		 * 출력예)1. 삽입
		 * 		2. 수정
		 * 		3. 삭제
		 * 입력예) 숫자를 선택하세요. : 2
		 * 출력여ㅖ 수정을 선택하셨습니다.
		 * 		 
		
		
		int num;
		

		System.out.println("1. 삽입");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("숫자를 선택하세요. : ");
		
		num = scn.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("삽입을 선택하셨습니다. ");
			break;
		case 2:
			System.out.println("수정을 선택하셨습니다.");
			break;
		case 3 :
			System.out.println("삭제를 선택하셨습니다. ");
			break;
		default:
			System.out.println("숫자를 잘 못 입력하셨습니다.");
		} */
		 /*
		  * 문제) 영문 대문자를 입력받아 'A'이면 "훌륭합니다.",
		  * 'b'이면 "좋습니다.", 'c'이면 "보통입니다.",
		  * 'd'이면 "노력하세요.", 그 외 문자는 "잘못입력하였습니다."
		  * 입력예)b
		  * 출력예)좋습니다.
		  */
		/*
		char a = scn.next().charAt(0);
		
		
		switch(a)
		
		{
			case 'A' :
				System.out.println("훌륭합니다.");
				break;
			case 'B'
			:
				System.out.println("좋습니다.");
				break;
			case 'C' :
				System.out.println("보통입니다.");
				break;
			case 'D' :
				System.out.println("노력하세요.");
			default :
				System.out.println("숫자를 잘 못 입력하셨습니다.");
		}
		*/
		
		/*
		 * 문제) 점수를 입력받아 " 수우미양가"를 평가하는 프로그램
		 * 입력예) 점수를 입력하세요. :
		 * 출력예) 수
		 */
		
		
		
		/*
		System.out.println("점수를 입력하세요. : ");
		int num = scn.nextInt();
		switch (num/10)
		{
			case 10 :
			case 9 :
				System.out.println("수");
			break;
			
			case 8 :
				System.out.println("우");
				break;
			case 7 : 
				System.out.println("미");
				break;
			case 6 :
				System.out.println("양");
				break;
			default :
			 System.out.println("가");
			
				
		}
	*/
		
		/*'
		 * 문제) 현재 월을 입력받아 입력 받은 월에 해당하는 계절을
		 * 출력하는 프로그램
		 * 3~5 "현재 계절은 봄입니다."
		 * 6~8 "현재 계절은 여름입니다."
		 * 9~11 "현재 계절은 가을입니다."
		 * 12~2 "현재 계절은 겨울입니다."
		 * 입력예) 현재 월을 입력하세요, : 3
		 * 출력) 현재 계절은 봄입니다.
		 * 
		 */
		
		/*System.out.println("현재 월을 입력하세요 : ");
		int month = scn.nextInt();
		
		
		switch (month)
		{
			case 3,4,5 :
				System.out.println("현재 계절은 봄입니다.");
			break;
			
			case 6 :
			case 7 :
			case 8 :
				System.out.println("현재 계절은 여름입니다.");
				break;
				
			case 9,10,11 :
				System.out.println("현재 계절은 가을입니다.");
			break;
			
			default :
			System.out.println("현재 계절은 겨울입니다.");
			
		}
	*/
		
		System.out.println("현재 월을 입력하세요 : ");
		int month = scn.nextInt();
		
		if(month < 6)
		{
			System.out.println("현재 계절은 봄입니다.");
		}
		else if ( month < 9)
		{
			System.out.println("현재 계절은 여름입니다.");
		}
		else if(month < 12)
		{
			System.out.println("현재 계절은 가을입니다.");
		}
		else 
		{
			System.out.println("현재 계절은 겨울입니다.");
		}
	}
	
	
	

}



















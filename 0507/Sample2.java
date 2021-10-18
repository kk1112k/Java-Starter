package sample1;
import java.util.*;
public class Sample2 {

	public static void main(String[] args) {
		//if~else if~
		/*
		 * 문제)점수를 입력받아 "수우미양가"로 평가하는 프로그램
		 * 입역예)점수를 입력하세요. : 89
		 * 출력예) 우
		 */

	/*	Scanner scn = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. : ");
		int score = scn.nextInt();
		
		if(score >= 90)
		{
			System.out.println("수");
		}
		else if(score >= 80)
		{
			System.out.println("우");
		}
		else if(score >=80 )
		{
			System.out.println("미");
		
		}
		else if(score >= 70)
		{
			System.out.println("양");
		}
		else
		{
			System.out.println("가");
		}
		*/
		/*
		 *  문제)주사위를 두번 던져서 나온수를 입력받아 두 수가 모두
		 *  4이상이면 "이겼습니다." 한개만 4이상이면 "비겼습니다."
		 *  모두 4미만이면 "졌습니다."라고 출력하는 프로그램
		 *  입력 예) 주사위를 던진 결과를 입력하세요. : 3 4
		 *  출력 예) 비겼습니다. 
		 *  if ~ else if~ 이용
		 */
	Scanner scn = new Scanner(System.in);
	
	System.out.print("주사위를 던진 결과를 입력하세요. : ");
	int a = scn.nextInt();
	int b = scn.nextInt();
	
	if(a>=4 && b>=4 )
	{
		System.out.println("이겼습니다.");
	}
	else if(a>=4 || b >= 4)
	{
		System.out.println("비겼습니다.");
	}
	else
	{
		System.out.println("졌습니다.");
	}
		
			
	}
	
}

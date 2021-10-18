package sample1;
import java.util.*;

public class Hello {

	public static void main(String[] args) {
		// 논리연산자
		/*
		boolean a = true , b = false, c = true;
	
		boolean result1 = a && b;
		boolean result2 = a && c;
		boolean result3 = a || b;
		boolean result4 = a || c;
		
		System.out.printf("result1 : %b\n", result1);
		System.out.printf("result2 : %b\n", result2);
		System.out.printf("result3 : %b\n", result3);
		System.out.printf("result4 : %b\n", result4);
		*/
		
		/*
		 *  문제) 3개의 정수 a,b,c,를 선언하고 각각 0,1,2,로
		 *  초기화한 후 논리연산을 이용한 결과 출력
		 *  조건 a가 b보다 작고 그리고 b가 c보다 작으면 true
		 *  	2- a와 b가 다르고 그리고 b와c가 다르면 true
		 *  출력예 ) true true 
		 */
	
		/*
		int a = 0, b = 1, c = 2;
		
		boolean result1 = (a<b) && (b<c);
		boolean result2 = (a!=b) && (b!=c);
		
		System.out.println("result + "" + result2");
			*/
		
		/*
		 * 문제)a와b의 키와 뭄무게를 입력받아 a가 키도 크고 몸무게도
		 * 크면 true, 그렇지 않으면 false를 출력하는 프로그햄
		 * 일력 예 ) 150 35 - a
		 * 			145 35 - b
		 * 출력 예) false
		 *
		 */
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("키와 몸무게를 입력하세요. :");
		
		int ah = scn.nextInt();
		int aw = scn.nextInt();
		int bh= scn.nextInt();
		int bw = scn.nextInt();
		
		boolean result1 =(ah > bh)&&(aw > bw);
		
		System.out.println(result1);
		
		//대입연산자를 이용하여 a의 키에 b의 키를 더해서 a의 키에 
		//저장한 후 출력하는 프로그램 (150 35 145 35)
		
		ah += bh;
		System.out.println("a와 b의 키를 더하면" + ah + "입니다");
		
	
		
		
		
		
		
		
				
	}
	

}

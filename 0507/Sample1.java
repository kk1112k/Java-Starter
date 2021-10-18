package sample1;
import java.util.*;

/* 제어문(조건문) */
public class Sample1 {

	public static void main(String[] args) {
		/*
		 * 한개의 정수를 입력받은 후 입력받은 수를 출력하고 그 수가
		 * 10보다 크면 다음 줄에 "10보다 큰 수를 입력하셨습니다."라는
		 * 메세지를 출력하는 프로그램
		 * 입력 예) 15
		 * 출력 예) 15
		 * 		10보다 큰 수를 입력하셨습니다.
		 */

		/*
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		System.out.println(num);
		
		if(num > 10)
		{
			System.out.println("10보다 큰 수를 입력하셨습니다.");
		}
		*/
		
		/* 
		 * 문제 ) 정수를 입력받아 젓줄에 입력받은 숫자를 출력하고
		 * 음수이면 "minus"라고 출력하는 프로그램 작성
		 * 입력 예)-5
		 * 출력 예 )-5
		 * 		minus
		 */
	
		/*
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		System.out.println(num);
	
		if(num<0)
		{
			System.out.println("minus");
		}*/
		
		/*
		 * 문제)정수 2개를 입력받아서 큰수와 작은수를 차례로 출력하는
		 * 프로그램
		 * 힌트 - 입력도 변수 a,b / 출력도 변수 a,b
		 * 입력 예) 2 9
		 * 출력 예) 입력받은 수 중 큰수는 9이고, 작은 수는 2 입니다.
		 */
		/*
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int tmp;
		
	
		if(a < b)
		{
			tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.printf("입력받은 수 중 큰수는 %d이고, 작은 수는 %d 입니다.",a,b);
	*/
		/*
		 * 문제)점수를 입력받아 80점 이상이면 합격 아니면 불합격을
		 * 출력하는 프로그램
		 * 입력 예) 점수를 입력하세요. : 89
		 * 출력 예) 축하합니다. 합격입니다.
		 * 
		 * 입력 예)점수를 입력하세요.  : 70
		 * 출력 예)죄송합니다. 불합격 입니다.
		 */
		
		/*Scanner scn = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int a = scn.nextInt();
		
		if(a >= 80)
		{
			System.out.println("축하합니다. 합격입니다.");
		}
		else
		{
			System.out.println("죄송합니다.불합격입니다.");
			
		}*/
		/*
		 *문제) 나이를 입력 받아 20살 이상이면 "adult"라고 출력하고
		 *그렇지 않으면 몇년후에 성인 되는지를 "_years later"하는
		 *메세지를 출력하는 프로그램 작성
		 *입력 예) 나이를 입력하세요. : 19
		 *출력 예) 1 years later
		 *
		 *입력 예)나이를 입력하세요 : 22
		 *출력 예 ) adult
		 */
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요. : ");
		
		int a = scn.nextInt();
		
		if(a>=20)
		{
			System.out.println("adult");
		}
		else
		{
			System.out.printf("%d years later \n", 20 -a );
			
		}
	
	}
		
}
	
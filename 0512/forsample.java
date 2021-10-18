package sample1;

import java.util.Scanner;

public class forsample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		/*반복제어문 for.
		int i, sum = 0;
		for(i=1; i<=10; ++i)
		{
			sum +=i;
			System.out.printf("i=%d,sum=%d \n", i, sum);
		}
		*/
		
		
		/*문제 )for문을 이용하여 출력하는 프로그램
		 * (출력할때 사용하는 변수 i변수 사용)
		 * 실행결과1
		 * 		2
		 * 		3
		 * 		4
		 * 		5
		 * 		12345
		 */	
		
		//int i;
		/*
		for(int i = 1; i<=5; ++i)
		{
			System.out.println(i);
			
		}
		for(int i =1; i<=5; ++i)
		{
			System.out.print(i);
		}
	*/
		
		/*
		 *실행결과)1부터 1까지의 합 : 1
		 *		1부터 2까지의 합 : 3
		 *		1부터 3까지의 합 : 6
		 *		1부터 4까지의 합 : 10
		 *		1부터 5까지의 합 : 15
		 *		1부터 6까지의 합 : 21
		 *		1부터 7까지의 합 : 28
		 *		1부터 8까지의 합 : 36
		 *		1부터 9끼지의 합 : 45
		 *		1부터 10까지의 합 :55
		 *
		 */
		/*
		int i , sum = 0;
		
		for(i = 1; i<=300; i++)
		{
			sum +=i;
			System.out.printf("1부터 %-8d까지의 합 : %-8d 입니다. \n",i,sum);
		
		
		}
	*/
		
		
		/*
		 *실행결과)1		10
		 * 		2		9
		 * 		3		8
		 * 		4		7
		 * 		5		6
		 * 		6		5
		 * 		7		4
		 * 		8		3
		 * 		9		2
		 * 		10		1
		 * 	
		 * 			
		 */
			/*
		int i, j;
			
			for(i=1,j=10; i<=10; i++,j--)
			{
				
				System.out.printf("%d \t\t %d\n", i,j);
			}
	*/
		/*
		 * 문제)10이하의 정수를 입력받아 정수만큼 "JAVA 프로그래밍"
		 * 이라고 출력하는 프로그램
		 * 입력예)5
		 * 출력예) Java 프로그램밍
		 * 		 Java 프로그래밍
		 * 		 java 프로그래밍
		 * 		 java 프로그래밍
		 * 		 java 프로그래밍	
		 */
	
		/*
			int i, n;
			n = scn.nextInt();
			
			
			for(i = 1; i <= n; i++)
			{
				System.out.println("JAVA 프로그래밍");
				
			}
			*/
		/*
		 * 문제) 대문자를 'A'부터 'Z'까지 출력하는 프로그램
		 * for문으로 char 타입변수 1개만 사용
		 * 출력예) ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 */
			
		/*	
			char i;
			
			
			for(i = 'A';i<='Z';i++)
			{
				System.out.printf("%c",i);
			}
		*/
		/*
		 * 문제)1부터 20까지의 홀수를 차례대로 출력하는 프로그램
		 * 출력예) 1 3 5 7 9 11 13 15 17 19
		 */
		/*
		int i;
		
		for(i=1; i<20; i+=2)
		{
			if(i%2 != 0)
			System.out.printf("%d \t",i);
		}
		
		System.out.println();
		for(i=1; i<20; i+=2)
		{
			
			System.out.printf("%d \t",i);
		}
	*/
		/*
		 * 문제)정수를 입력받아 1부터 입력받은 수까지의 합을 출력하는
		 * 프로그램
		 * 입력예)10
		 * 출력예)55
		 * 
		 */
			/*
				int i ,n, sum = 0;
				n = scn.nextInt();
				
				for(i = 1; i<=n ; i++)
				{
					sum +=i;
				}
				
				System.out.print(sum);
				
				*/
				/*
				 * 문제) 정수를 입력받아 입력받은 정수부터 100까지의 합을
				 * 출력하는 프로그램 (입력받는 정수는 100이하)
				 * 입력예)95
				 * 출력예)585
				 */
	
	/*
			int i, n, sum = 0;
			n= scn.nextInt();
			
			for(i=n; i <=100; i++)
			{
				sum += i;
			}
				System.out.print(sum);
				*/
		
		/*
		 * 문제) 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 
		 * 몇개인지 출력하는 프로그램
		 * 입력예)15 22 3 129 66 81 35 1 46 888
		 * 출력예)입력받은 짝수는 4개입니다.
		 * 
		 */
		/*	
		int i, n, count=0;
			
			
			for(i=1; i<=10; i++)
			{
				n=scn.nextInt();
				
				if(n %2 == 0)
				{
					count++;
				}
				
			}
			
			System.out.printf("입력받은 짝수는 %d입니다.\n ",count);
			*/
		/*
		 * 문제)10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를
		 * 각각 출력하는 프로그램
		 * 입력예) 10 15 36 99 100 19 46 88 87 13
		 * 출력예)3의 배수 : 4
		 * 		5의 배수 : 3
		 * 
		
		
			int i, n, count=0 , count2=0;
			
			for(i=1;i<=10;i++)
			{
				n=scn.nextInt();
				
				if(n %3==0)
				{
					count++;
				}
				if(n %5==0)
				{
					count2++;
				}
			}
			
			System.out.printf("3의 배수 : %d\n", count);
			System.out.printf("5의 배수 : %d  ", count2);
	 */
		/*
		 * 문제)5명의 성적을 입력받아서 충점과 평균을 출력하는 프로그램
		 * 평균은 소수 첫째자리까지 출력.
		 * 입력예)90 85 100 66 88 //score
		 * 출력예) 총점 : 429      // sum
		 * 		 평균 : 85.8		// avg = sum / 5.0 , (double)
		 * 
		 */
			
			int i,score,n, sum=0;		
			double avg;
			System.out.println("학생들이 몇명인가요?");
			n = scn.nextInt();
			
			for(i=1; i<=n; i++)
			
			{
				score = scn.nextInt();
				sum +=score;
				
			}
			avg = (double)sum/n;
			System.out.printf("총점: %d\n", sum);
			System.out.printf("평균: %.1f", avg);
	}
	
	
	
	
}

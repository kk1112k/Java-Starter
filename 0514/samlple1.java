package sample;

import java.util.Scanner;

public class samlple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		/*
			int a =11;
			
			while(a<=10)
			{
				System.out.println(a++);
			}
			a = 11;
			do
			{
				System.out.println(a++);
			} while(a<=10);
			
			*알파벳 a-z 출력하는 프로그램
			
			
			char  alpha= 'A';
			
			while(alpha <='Z')
			{
				System.out.printf("%c", alpha++);
			}
			
			문제 )정수 변수 num 선언하고 1대입해 1씩 증가시키면서 10까지 누적 합 구하는 프로그램.
			while문 이용해 작성하고 1부터 10까지 합과 while문이 끝난 후의 num의 값을 출력하는 프로그램
			출력예 1부터 10까지의 합 = 55
				 while문 끝나고 num값 =11
					
			
			int num =1; 
			int sum =0; 
			
			 while(num<= 10)
			 {
				 sum += num;
				 num++;
				 
			 }
			System.out.printf("1부터 10까지의 합은 %d\n",sum);
			System.out.printf("num의 값 = %d", num);
			
			
			 문제 점수를 입력받아 80이상 합격, 아님 불합격하는 작업 반복하다가
			 0~100이ㅇ외 점수 입력이면 종료.
			 입 출력예 
			 점수입력하세요. : 50
			 ㅂ죄송합ㅂ니다 불합격
			 점수입력하세요 : 80 
			 축하해요 합격
			 점수입력하세요 : 111
			 끝
							
		int score;
		System.out.print("점수를 입력하세요 : ");
		score =scn.nextInt();
		
		while(score>=0 && score<= 100)
		{
			if(score < 80)
			{
				System.out.println("죄송합니다. 불합격입니다.");
			}
			else
			{
				System.out.println("축하합니다. 합격입니다.");
			}
			System.out.print("점수를 입력하세요 : ");
			score=scn.nextInt();
			 
			 같은 내용 무한루프
		
		int score;
		
		while(true)
		{
			System.out.print("점수 입력하세요 : ");
			score = scn.nextInt();
			
			if(score <0 || score >100)
			{
				break;
			}
			if(score>=80)
			{ 
				System.out.print("합격입니다.\n");
			}
			else
			{
				System.out.print("불합격입니다. \n");
			}
		}
		while 문
		문제 정수를 계속 입력받다가 0이 되명 0제외하고 이전 입력 자료수와 합계
		평균 출력. 평균은 소수2까지
		입력ㅇ/ㅔ 15 88 97 0
		출력 입력자료 개수 = 3
			입력자료 합계 = 200
			입력자료 평균 = 66.67 (%.2f)
		
	
		int a=0;
		int sum=0;
		int cnt=0;
		double avg=0;
		

		while(true)
		{	
			a= scn.nextInt();
			
			if(a ==0)
			{
				break;
			}
			
			sum += a;
			cnt ++;
			
		}
		avg = (double)sum/cnt;
		System.out.printf("입력된 자료의 개수 = %d \n", cnt);
		System.out.printf("입력된 자료의 합계 = %d \n", sum);
		System.out.printf("입력된 자료의 평균 = %.2f", avg);
		
		
		문제 정수 입력받다가 0입려되면 입력된 수중 홀수 합과 평균 출력 !
		평균 정수로 구하기. 
		입력ㅇㅖ 5 8 17 6 31 0
			  홀 합 = 53
			  홀 평  =17
	
	
		int a =0;
		int avg;
		int sum=0, cnt=0;
		
		while(true)
		{
			a = scn.nextInt();
			if(a==0)
			{
				break;
			}
			
			 if(a%2 != 0)
			{
				 sum +=a;
				cnt++;
			}
			 
		}
		
		avg = sum/cnt;
		System.out.printf("홀수의 합 : %d \n", sum);
		System.out.printf("홀수의 평균 : %d", avg);
		
		DO WHILE 
		문제 ) 아래와 같이 메시지를 출력하고 숫자를 입력받아 선택한 번호에 해당하는 메시지를 
		출력하는 작업을 반ㄴ복하다 4가 입력되면 메세지 출력후 종료 프로그램
		(1~4 이외릐 숫자가 입력되면 "잘못 선택하셨어융")
		입 출력예
		1. 입력하기
		2. 출력하기
		3. 삭제하기
		4. 끝내기
		작업할 번호 선택하기 : 2
		
		출력하기를 선택하였습니다.
		
		1. 입력하기
		2. 출력하기
		3. 삭제하기
		4. 끝내기
		작업할 번호 선택하기 : 5
		
		잘못 선택하였습니다.
		
		1. 입력하기
		2. 출력하기
		3. 삭제하기
		4. 끝내기
		작업할 번호 선택하기 : 4
		
		끝내기를 선택하였습니다.
			
	*/
		int a=0;
		
		
		do
		{	
			System.out.println("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기");
			System.out.print("\n작업할 번호를 선택하세요. : ");
			a = scn.nextInt();
			switch(a)
			{
			case 1:
				System.out.println("\n입력하기를 선택하셨습니다.");
			break;
			case 2:
				System.out.println("\n출력하기를 선택하셨습니다.");
			break;
			case 3 :
				System.out.println("\n삭제하기를 선택하셨습니다.");
			break;
			case 4 :
				System.out.println("\n끝내기를 선택하셨습니다.");
				break;
			default:
				System.out.println("\n잘못");
			}
		}
		while( a !=4);
		
	
	
	}
	
	

}


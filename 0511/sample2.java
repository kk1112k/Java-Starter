package sample1;
import java.util.*;

public class sample2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// switch
		/*
		 * 문제)가위,바위,보 게임
		 * 		가위 (1),바위(2), 보(3)을 입력받아
		 * 		컴퓨터는 랜덤으로 발생하여 가위 바위 보 게임을 진행.
		 * 입력예) 가위 (1), 바위 (2), 보(3) 중 하나를 입력하세요. :
		 * 출력예) 당신은 1입니다.
		 * 		 컴은 1입니다.
		 * 		 비겼습니다.
		 * 
		 * 입력예) 가위 (1), 바위 (2), 보(3) 중 하나를 입력하세요. :
		 * 출력예) 당신은 3입니다.
		 * 		 컴은 2입니다.
		 * 		 당신이 이겼습니다.
		 */
		/*
		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 : ");
		
		int user = scn.nextInt();
		int com = (int)(Math.random()*3) +1;
		
		System.out.printf("당신은 %d입니다. \n", user);
		System.out.printf("컴은 %d입니다. \n", com);
		
		switch(user-com)
		{
		case -2:
		case 1 :
			System.out.println("당신이 이겼습니다.");
			break;
			
		case -1 :
		case 2 :
			System.out.println("당신이 졌습니다.");
			break;
		case 0 :
			System.out.println("비겼습니다.");
		break;
		}
		*/
		/* 문제) 주민등록 번호를 입력받아 남자인지 여자인지 구분하는 프로그램
		 * 입력예) 당신의 주민번호를 입력하세요. : 100203-4157321 //특정위치의 값만 읽어오기 ! (char)
		 * 출력예) 당신은 여자입니다.
		 * 남자 : 1, 3 여자 : 2,4
		 * 
		 */
		
		
		/*
		System.out.println("당신의 주민번호를 입력하세요. :      ");
		String num = scn.nextLine();
		
		char gender = num.charAt(7);
		
		switch(gender)
		{
		case '1':
		case '3':
			System.out.println("당신은 남자입니다");
		break;
		
		case '2':
		case '4':
			System.out.println("당신은 여자입니다.");
		default :
			System.out.println("주민번호가 잘 못 되었습니다");
		}
	*/
		/*
		System.out.println("당신의 주민등록번호를 입력하세요 : ");
		String num = scn.nextLine();
		
		char gender = num.charAt(7);
		
		if( gender == '1' || gender =='3')
		{
			System.out.println("당신은 남자입니다.");
			
		}
		else if (gender == '2' || gender == '4')
		{
			System.out.println("당신은 여자입니다.");
		}
	
		*/
		/*
		 * 문제)1번은 강아지, 2번은 고양이, 3번은 병아리로 정하고 
		 * 번호 입력하면 해당동물을 영어로 출력
		 * 해당번호 없으면 "번호가 잘못되었습니다."
		 * 강아지 dog 고양이 cat 병아리 chick
		 * 입력예) 번호를 입력하세요. : 2
		 * 출력예) cat
		 * 
		*/ 
			/*
		System.out.print("번호를 입력하세요 : ");
			
			int ani = scn.nextInt();
			
			switch(ani)
			{
			case 1 :
				System.out.println("dog");
				break;
				
			case 2 :
				System.out.println("cat");
				break;
				
			case 3 :
				System.out.println("chick");
			}
	
	*/
		
		/*
		 * 문제)1~12 사이의 정수를 입력받아 평년의 경우 입력받은 월의 날수를 
		 * 출력하는 프로그램
		 * 2월 28일 (평년)
		 * 1,3,5,7,8,10,12월 31일
		 * 4,6,9,11월 30일
		 * 입력예) 2월
		 * 출력예) 28
		 * 
		 * 년도와 월을 입력받아 해당년도가 윤년이면 2월 29일로 출력
		 * 입력)2020 2
		 *  출력예)2020년은 윤년으로 29일입니다.
		 *  2021년은 평년으로 28일 입니다.
		 */
	
		
		
		System.out.print("연도를 입력하세요. ");
		
		int year = scn.nextInt();
		int month = scn.nextInt();
		int day = 30;
		String info = "평년";
		
		
		if( (year % 400 == 0 )
				|| (year % 4 == 0 && year % 100 != 0)) 
		{ 
			info = "윤년";
			
		}
		if(month == 2)
		{
			if( (year % 400 == 0 )
					|| (year % 4 == 0 && year % 100 != 0)) 
			{ 
				day = 29;
				
			}
			else
			{
				day = 28;
			}
			System.out.printf("%d년은 %s으로 %d일 입니다. \n",year, info, day);
			
		}
		else if (month ==4|| month==6|| month==9|| month == 11 )
		{ 
			
			day = 30;
			
		}
		else
		{
			day = 31;
		}
		System.out.printf("%d년은 %s으로 %d일 입니다. \n",year, info, day);
		
		/*
		System.out.println(year + " 년은 " + isYear +"입니다..");
	}
		if(month == 2)
		{
			System.out.println("28");
			
		}
		else if (month == 3 || month == 5 || month ==1 || 
				month ==7 || month == 8 || month ==10  || month ==12)
		{
			System.out.println("31");
		
		}
		else 
		{
			System.out.println("30");
		}
	
		*/
	/*
		int month = scn.nextInt();
		
		switch(month)
		{
		case 2 :
			System.out.println("28");
			break;
			
		case 1,3,5,7,8,10,12 :
			System.out.println("31");
		break;
		
		default :
			System.out.println("30");
		
		}
	
	*/
	
	}
	
}

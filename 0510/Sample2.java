import java.util.*;
import java.util.Scanner;

public class Sample2 {
	static int[][] mapping (int[][] arr, int x, int y){
		int[][] result = arr;
		result[x][y] += 1;
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int[][] map = new int[][] {{0,0,0,0,0},
									{0,0,0,0,0},
									{0,0,0,0,0},
									{0,0,0,0,0},
									{0,0,0,0,0}};
		int posx =2; int posy = 2;
		for(int i =0; i < 10000; i++) {
			int move = 0;
			move = (int)(Math.floor(Math.random()*4));
			switch (move) {
			case 0: {
					posx++;
					posx = (posx>4)? (posx = 0 ) :posx;
			}
			case 1:{
					posx--;
					posx = (posx<0)? (posx = 4 ) :posx;
			}
			case 2:{
					posy++;
					posy = (posy>4)? (posy = 0 ) :posy;
			}
			case 3:{
					posy--;
					posy = (posy<0)? (posy = 4 ) :posy;
			}
			
			}
			
			map = mapping(map,posx,posy);
		
		
		
		} // end for
		for(int i =0; i<map.length; i++) {
			for(int j =0; j<map[i].length; j++) {
				System.out.print(((float)map[i][j]/100) +"%.");
			}
			System.out.println();
		}
		
	}
}
		
		
		/*
		System.out.print("연도를 입력하세요. \r=>");
		int year = scn.nextInt();
		String isYear = "";
		
		if( year % 4 == 0 || (year % 4 == 0 && year % 100 != 0)) { 
			isYear = "윤년";
		}
		else
		{
			isYear = "평년";
		}
		
		System.out.println(year + " 년은 " + isYear +"입니다..");
	}
	*/	
		
		
		
		
//		System.out.print("<정수를 입력하세요.>\r=> ");
//		int a = scn.nextInt();
//		if(a==0)System.out.print(": Zero");
//		else System.out.print( (a>0)? ": Plus(Positive)" : ": Minus(Negative)");
		
		
				
		
		
//		System.out.print("두개의 정수를 입력하세요 >>\r\n");
//		int a = scn.nextInt();
//		int b = scn.nextInt();
//		
//		if (b>a) {
//			a = a^b; b=a^b; a=a^b;
//		}
//		
//		System.out.println(" => "+(a-b));
		

		
		
		
		
		
		
		
//		System.out.print(">>");
//		String gender = scn.next();
////		int age = Integer.parseInt(scn.next());
//		int age = scn.nextInt();
//		
//		System.out.print("=>");
//		if (gender.equalsIgnoreCase("M")) {System.out.println((age>=18)?" MAN":" BOY");}
//		else {System.out.println((age>=18)?" WOMAN":" GIRL");}
		
//		List<String> names = Arrays.asList("김갑순", "김갑돌");
//        // x를 건네고 받는 과정에서 x를 두 번 적게 된다.
//        names.forEach(x -> System.out.println(x));
//        // 아예 x들을 빼버리고 아래와 같이 작성할 수 있다.
//        names.forEach(System.out::println);
//		
		
		
		
//		System.out.println(">>");
//		
//		int score = scn.nextInt();
//		String grade = "";
//		char opt = ' ';
//		if (score>=90) {
//			grade = "A";
//		} else if (score>=80) {
//			grade = "B";
//		} else {
//			grade = "C";
//		}
//		if(score%10 >= 8 || score ==100) {opt = '+';}
//		else if(score%10>=5) {opt = ' ';}
//		else {opt = '-';}
//		System.out.printf("당신의 점수는 %d 입니다.\n 당신의 학점은 %s%c입니다.",score,grade,opt);
			
		
		
		
//		String[] input = scn.nextLine().split(" ");
		
		
//		boolean sex = input[0].equalsIgnoreCase("m"); // 남자면 true;
//		boolean isAdult = (18 <= Integer.parseInt(input[1]));
//		
//		System.out.println(
//													(sex)? 
//						((isAdult)? "MAN" : "BOY"):
//							((isAdult)? "WOMAN" : "GIRL") 
//						);			
//		
//		if (sex && isAdult) {
//			System.out.println("Man");
//		}else if (sex && !isAdult) {
//			System.out.println("boy");
//		}else if (!sex && isAdult) {
//			System.out.println("woman");
//		}else {
//			System.out.println("girl");
//		}

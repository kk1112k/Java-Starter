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
		System.out.print("������ �Է��ϼ���. \r=>");
		int year = scn.nextInt();
		String isYear = "";
		
		if( year % 4 == 0 || (year % 4 == 0 && year % 100 != 0)) { 
			isYear = "����";
		}
		else
		{
			isYear = "���";
		}
		
		System.out.println(year + " ���� " + isYear +"�Դϴ�..");
	}
	*/	
		
		
		
		
//		System.out.print("<������ �Է��ϼ���.>\r=> ");
//		int a = scn.nextInt();
//		if(a==0)System.out.print(": Zero");
//		else System.out.print( (a>0)? ": Plus(Positive)" : ": Minus(Negative)");
		
		
				
		
		
//		System.out.print("�ΰ��� ������ �Է��ϼ��� >>\r\n");
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
		
//		List<String> names = Arrays.asList("�谩��", "�谩��");
//        // x�� �ǳװ� �޴� �������� x�� �� �� ���� �ȴ�.
//        names.forEach(x -> System.out.println(x));
//        // �ƿ� x���� �������� �Ʒ��� ���� �ۼ��� �� �ִ�.
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
//		System.out.printf("����� ������ %d �Դϴ�.\n ����� ������ %s%c�Դϴ�.",score,grade,opt);
			
		
		
		
//		String[] input = scn.nextLine().split(" ");
		
		
//		boolean sex = input[0].equalsIgnoreCase("m"); // ���ڸ� true;
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

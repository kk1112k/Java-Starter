import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		
		char grade = ' ';
		Scanner scn = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.\r");
		int score = scn.nextInt();
//		String str = "입력하신 숫자는 ";
////		str += (a!=0)?"0이 아닙니다.":"0입니다";
//		if(a==0) str+= "0입니다.";
//		else str += "0이 아닙니다.";
//		System.out.printf(str+ "\n입력하신 숫자는 %d 입니다.\n", a);
//		
		if(score>=90) 
			{ 
			 grade ='A';
			}
		else if (score>=80) 
		{
			grade ='B';
		}
		else if (score>=70)
			{
			grade ='c';
			}
		else 
			{
			grade= 'D';
			}
		
		System.out.println("당신의 학점은" + grade + "입니다.");
		
		
		
		
		
	}
}

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		
		char grade = ' ';
		Scanner scn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.\r");
		int score = scn.nextInt();
//		String str = "�Է��Ͻ� ���ڴ� ";
////		str += (a!=0)?"0�� �ƴմϴ�.":"0�Դϴ�";
//		if(a==0) str+= "0�Դϴ�.";
//		else str += "0�� �ƴմϴ�.";
//		System.out.printf(str+ "\n�Է��Ͻ� ���ڴ� %d �Դϴ�.\n", a);
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
		
		System.out.println("����� ������" + grade + "�Դϴ�.");
		
		
		
		
		
	}
}

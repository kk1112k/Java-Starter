package sample;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		//배열을 만들어 반복문을 이용래 아래와 같이 저장한 후 출력하는 프로그램
		/*
		 * 출력예)
		 * 1 1 1 1 1
		 * 1 2 3 4 5
		 * 1 3 6 10 15
		 * 1 4 10 20 35 
		   1 5 15 35 70
		   첫번째 전부 1로 초기화 한후 내거 왼쪽 + 바로 위 값을 더해 저장(배열크기 5행5열)
		
		
			int [][] a= new int[5][5];
			int i,j;
			
			
			for(j=0;j<5;j++)
			{
				a[0][j]=1;
			}
			
			for(i=1;i<5;i++)
			{
				for(j=0;j<5;j++)
				{
					if(j==0)
					{
						a[i][j]=a[i-1][j];
					}
					else
					{
						a[i][j]=a[i-1][j]+a[i][j-1];
					}					
				}
			}
			for(i=0;i<5;i++)
			{
				for(j=0;j<5;j++)
				{
					System.out.printf("%d " , a[i][j]);
				}
				System.out.println();
			}
			
				
		 */
		String[][] word = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		int i;
		String tmp;
		
		for(i=0; i<word.length;i++)
		{
			System.out.printf("Q%d. %s의 뜻은?",i, word[i][0]);
			
			tmp = scn.nextLine();
			
			if(tmp.equals(word[i][1]))
			{
				System.out.println("정답입니다.\n");
				
			}
			else
			{
				System.out.println("틀렸어요. 정답은 " + word[i][1]+"입니다\n");
			}
		}
 }

}

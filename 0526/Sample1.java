package sample;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		//�迭�� ����� �ݺ����� �̿뷡 �Ʒ��� ���� ������ �� ����ϴ� ���α׷�
		/*
		 * ��¿�)
		 * 1 1 1 1 1
		 * 1 2 3 4 5
		 * 1 3 6 10 15
		 * 1 4 10 20 35 
		   1 5 15 35 70
		   ù��° ���� 1�� �ʱ�ȭ ���� ���� ���� + �ٷ� �� ���� ���� ����(�迭ũ�� 5��5��)
		
		
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
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
		};
		
		int i;
		String tmp;
		
		for(i=0; i<word.length;i++)
		{
			System.out.printf("Q%d. %s�� ����?",i, word[i][0]);
			
			tmp = scn.nextLine();
			
			if(tmp.equals(word[i][1]))
			{
				System.out.println("�����Դϴ�.\n");
				
			}
			else
			{
				System.out.println("Ʋ�Ⱦ��. ������ " + word[i][1]+"�Դϴ�\n");
			}
		}
 }

}

package sample1;
import java.util.*;

public class Hello {

	public static void main(String[] args) {
		// ��������
		/*
		boolean a = true , b = false, c = true;
	
		boolean result1 = a && b;
		boolean result2 = a && c;
		boolean result3 = a || b;
		boolean result4 = a || c;
		
		System.out.printf("result1 : %b\n", result1);
		System.out.printf("result2 : %b\n", result2);
		System.out.printf("result3 : %b\n", result3);
		System.out.printf("result4 : %b\n", result4);
		*/
		
		/*
		 *  ����) 3���� ���� a,b,c,�� �����ϰ� ���� 0,1,2,��
		 *  �ʱ�ȭ�� �� �������� �̿��� ��� ���
		 *  ���� a�� b���� �۰� �׸��� b�� c���� ������ true
		 *  	2- a�� b�� �ٸ��� �׸��� b��c�� �ٸ��� true
		 *  ��¿� ) true true 
		 */
	
		/*
		int a = 0, b = 1, c = 2;
		
		boolean result1 = (a<b) && (b<c);
		boolean result2 = (a!=b) && (b!=c);
		
		System.out.println("result + "" + result2");
			*/
		
		/*
		 * ����)a��b�� Ű�� �����Ը� �Է¹޾� a�� Ű�� ũ�� �����Ե�
		 * ũ�� true, �׷��� ������ false�� ����ϴ� ���α���
		 * �Ϸ� �� ) 150 35 - a
		 * 			145 35 - b
		 * ��� ��) false
		 *
		 */
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ű�� �����Ը� �Է��ϼ���. :");
		
		int ah = scn.nextInt();
		int aw = scn.nextInt();
		int bh= scn.nextInt();
		int bw = scn.nextInt();
		
		boolean result1 =(ah > bh)&&(aw > bw);
		
		System.out.println(result1);
		
		//���Կ����ڸ� �̿��Ͽ� a�� Ű�� b�� Ű�� ���ؼ� a�� Ű�� 
		//������ �� ����ϴ� ���α׷� (150 35 145 35)
		
		ah += bh;
		System.out.println("a�� b�� Ű�� ���ϸ�" + ah + "�Դϴ�");
		
	
		
		
		
		
		
		
				
	}
	

}

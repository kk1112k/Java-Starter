package sample1;
import java.util.*;

public class Hello2 {

	public static void main(String[] args) {
		// �Է� Scanner Ŭ������ ���
		// java.util.*
		Scanner scn = new Scanner(System.in);
		String addr = "";
		
		System.out.print("����� ���̸� �Է��ϼ���. : ");
		String input = scn.nextLine();
		
		System.out.print("����� �̸��� �Է��ϼ���. : ");
		String name = scn.nextLine();
		
		System.out.print("����� �ּҸ� �Է��ϼ���. : ");
		 addr = scn.nextLine();
		
		System.out.printf("�Է��Ͻ� ����� ���̴� %s���̰� �̸��� %s�Դϴ�.", input, name);
		
		System.out.println();
		
		System.out.printf("�Է��Ͻ� �ּҴ� %s �Դϴ�.", addr);
		
			
	}

}

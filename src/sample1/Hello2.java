package sample1;
import java.util.*;

public class Hello2 {

	public static void main(String[] args) {
		// 입력 Scanner 클래스를 사용
		// java.util.*
		Scanner scn = new Scanner(System.in);
		String addr = "";
		
		System.out.print("당신의 나이를 입력하세요. : ");
		String input = scn.nextLine();
		
		System.out.print("당신의 이름을 입력하세요. : ");
		String name = scn.nextLine();
		
		System.out.print("당신의 주소를 입력하세요. : ");
		 addr = scn.nextLine();
		
		System.out.printf("입력하신 당신의 나이는 %s살이고 이름은 %s입니다.", input, name);
		
		System.out.println();
		
		System.out.printf("입력하신 주소는 %s 입니다.", addr);
		
			
	}

}

package sample1;

public class Hello2 {

	public static void main(String[] args) {
		/*
		 * int a = 10, b = 20 일 경우
		 * 실행경과 a : 10, b = 20
		 * 		a:20, b:10
		 */
		
		int a = 10, b =20;
		int tmp;
		
		System.out.printf("a : %d, b : %d" ,a,b);
		
		tmp=a;
		a=b;
		b=tmp;
		System.out.printf("\na : %d, b : %d" ,a,b);
	
		
		

	}

}

package sample2;

public interface GraphicsCard {

		/*
		 * 인터페ㅣㅇ스는 몸체가 없는 메서들의 모임
		 * 클래스를 구현하기 전에 만들 메서드를 먼저 정해 놓ㄴ는것.
		 * (중요)개발자 사이의 코드 규약을 정함.
		 * (다형성) 여러 구현체에서 공통적인 부분을 추상화
		 */
		//제조사
		public String company();
		
		//모델 
		public String model();
		
		
		//메모리
		public int memory();
		
		//출력
		public void write(PointColor pointColor);
		
	}



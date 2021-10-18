package sample2;

public class AmdRadeon implements GraphicsCard{

	private String company;
	private String model;
	private int memory;
	
	public AmdRadeon(String model, int memory)
	{
		this.company = "AMD";
		this.model =  model;
		this.memory = memory;
	}
		//제조사
		public String company()
		{
			return company;
		}
		
		//모델 
		public String model()
		{
			return model;
		}
		
		
		//메모리
		public int memory()
		{
			return memory;
		}
		
		//출력
		public void write(PointColor pointColor) //인터페이스 상속받아서 구현함.
		{
			if(pointColor != null)
			{
			Rgb rgb = pointColor.getRgb();
			
			System.out.println("--- " + company + "GraphicsCard 출력");
			System.out.println("1. color를 구성한다.");
			System.out.println("");
			
			if(rgb != null)
			{
			System.out.println("Blue : " + pointColor.getRgb().getBlue() );
			System.out.println("Red : " + pointColor.getRgb().getRed());
			System.out.println("Green : " + pointColor.getRgb().getGreen());
			}
			System.out.println("2. 좌표를 구한다.");
			System.out.println("x : " + pointColor.getX());
			System.out.println("y : " + pointColor.getY());
			
			System.out.println("3.모니터 좌표에 색상을 출력.");
		}
	}
			
			
			
}


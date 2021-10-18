package sample2;

public class GrapicsCardMain {
	
	//운영체제에 그래픽 출력
	public void operatingSystemWrite(GraphicsCard graphicsCard,PointColor pointColor)
	{
		if(graphicsCard != null)
		{
			System.out.println("그래픽카드 출력");
			System.out.println("회사명 : "+ graphicsCard.company());
			System.out.println("모델명 : " + graphicsCard.model());
			System.out.println("메모리 : " + graphicsCard.memory());
			
			System.out.println("출력순서");
			graphicsCard.write(pointColor);
		}
	}

	public static void main(String[] args) {
		
		GraphicsCard amdRadeon = new AmdRadeon("Rx 50000", 4096);
		
		NvidiaGeForce nvidiaGeForce = new NvidiaGeForce("Gefprce Gt 710", 2048);
		
		PointColor pointColor = new PointColor();
		
		pointColor.setX(100);
		pointColor.setY(200);
		
		pointColor.setRgb(new Rgb(255,128,100));
		
		GrapicsCardMain cardMain = new GrapicsCardMain();
		
		cardMain.operatingSystemWrite(amdRadeon, pointColor);
		
		System.out.println();
		
		cardMain.operatingSystemWrite(amdRadeon, pointColor);

	}

	private static GrapicsCardMain GraphicsCardMain() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

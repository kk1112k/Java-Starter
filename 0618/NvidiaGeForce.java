package sample2;

public class NvidiaGeForce implements GraphicsCard{
	
	private String company;
	private String model;
	private int memory;
	
	public NvidiaGeForce(String model, int memory)
	{
		this.company = "NVIDIA";
		this.model = model;
		this.memory = memory;
	}
	
	//������
	public String company()
	{
		return company;
	}
	
	//�� 
	public String model()
	{
		return model ;
	}
	
	//�޸�
	public int memory()
	{
		return memory;
		
	}
	
	//���
	public void write(PointColor pointColor)
	{
		if(pointColor != null)
		{
			Rgb rgb = pointColor.getRgb();
			
			System.out.println("---" + company + "GraphicsCard ���");
			System.out.println("1. ��ǥ�� ���Ѵ�.");
			System.out.println("x : " + pointColor.getX());
			System.out.println("y : "+pointColor.getY());
			
			System.out.println("2. color�� �����Ѵ�.");
			
			if(rgb != null)
			{
				System.out.println("Red : " +pointColor.getRgb().getRed());
				System.out.println("Green : "+pointColor.getRgb().getGreen());
				System.out.println("Blue : " + pointColor.getRgb().getBlue());
			}
			System.out.println("�������");
		}
	}
}

package RelationShips;

public class Car {
	private String color;
	private String brand;
	private String type;
	private String reg_no;
	private String seats;
	Engine engine;
	Car(String color,String brand,String type,String reg_no,String seats,
			String engin_type,Long No_of_cylinders,int hourse_power,long engin_no)
	{
		this.color=color;
		this.brand=brand;
		this.type=type;
		this.reg_no=reg_no;
		this.seats=seats;
		engine = new Engine(engin_type, No_of_cylinders, hourse_power, engin_no);
  }
	public void CarDetails()
	{
	System.out.println("car color is: "+color);
	System.out.println("car brand is: "+brand);
	System.out.println("car type is: "+type);
	System.out.println("car reg_no is: "+reg_no);
	System.out.println("car seats is: "+seats);
	
		
		
	}
}
	
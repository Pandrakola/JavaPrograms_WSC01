package RelationShips;

public class Engine {
	private String engin_type;
	private Long No_of_cylinderrs;
	private int hourse_power;
	private long engin_no;
	
	Engine(String engin_type,Long No_of_cylinders,int hourse_power,long engin_no)
	{
		this.engin_type=engin_type;
		this.No_of_cylinderrs=No_of_cylinders;
		this.hourse_power=hourse_power;
		this.engin_no=engin_no;
	}
	public void EnginDetails()
	{
	System.out.println("car engin_type :"+engin_type);
	//System.out.println("car no_of_cylinders :"+No_of_cylinders);
	System.out.println("car hourse_power :"+hourse_power);
	System.out.println("car engin_type :"+engin_type);
	System.out.println("car engin_no :"+engin_no);
		
		
	}
	
	}


package RelationShips;

public class College {
	private String collageName;
	private String university;
	private String caddress;
	
	College(String collageName,String university,String caddress){
		this.collageName=collageName;
		this.university=university;
		this.caddress=caddress;
	}
	public void CollegeDeclaration()
	{
	System.out.println("collageName is "+collageName);	
	System.out.println("university is "+university);
	System.out.println("caddress is "+caddress);
	}
	}


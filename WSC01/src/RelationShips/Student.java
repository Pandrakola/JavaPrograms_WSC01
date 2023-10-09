package RelationShips;

public class Student {
	private String Name;
	private int roll_No;
	private String gender;
	private String age;
	private String department;
	College college;

Student(String Name,int roll_No,String gender,String age,String department,
		String collageName,String university,String caddress)
{
	this.Name=Name;
	this.roll_No=roll_No;
	this.gender=gender;
	this.age=age;
	this.department=department;
	college=new College(collageName, university, caddress);
}
   public void  StudentDetails() 
   {
	   System.out.println("Student Name is :"+Name);
	   System.out.println("Student roll_No is :"+roll_No);
	   System.out.println("Student gender is :"+gender);
	   System.out.println("Student age is :"+age);
	   System.out.println("Student department is :"+department);

}
}
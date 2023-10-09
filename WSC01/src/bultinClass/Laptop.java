package bultinClass;

public class Laptop {
	String hard_disk;
	String ram_size;
	String processor;
	
	public void Coding()
			{
				System.out.println("Java programs");
			
			}
	public Laptop(String hard_disk, String ram_size, String processor) {
		super();
		this.hard_disk = hard_disk;
		this.ram_size = ram_size;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [hard_disk=" + hard_disk + ", ram_size=" + ram_size + ", processor=" + processor + "]";
	}

	
		

}

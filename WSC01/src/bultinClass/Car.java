package bultinClass;

import java.util.Objects;

class Car{

String brand;
String color;
String model;
String variant;
public void race(){
System.out.println("ready to race");
	// TODO Auto-generated method stub
}
	public Car(String brand, String color, String model, String variant) {
			super();
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.variant = variant;
	}
	
	@Override
	public boolean equals(Object obj) {
		Car c=(Car)obj;
		if (this.brand==c.brand&&this.color==c.color&&this.model==c.model&&this.variant==c.variant)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
				&& Objects.equals(model, other.model) && Objects.equals(variant, other.variant);
	}


	

	}
	



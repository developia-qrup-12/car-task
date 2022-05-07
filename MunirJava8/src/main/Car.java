package main;

public class Car implements CarInterface {
	String name;
	int speed;
	int price;
	
	@Override
	public String carSpeed(String name, int speed) {
		return name+" "+speed;
	}
	
	@Override
	public String carPrice(String name, int price) {
		return name+" "+price;
	}
	

}

package main;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Masinin adi "+ car.carPrice("BMW, Sureti ise", 400));
		
		System.out.println("Masinin adi "+  car.carPrice("BMW, Qiymeti ise", 200000));
		
	 }
    
} 

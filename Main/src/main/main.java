package main;

public class main {

	public static void main(String[] args) {
		Car car= new Car();
		System.out.println("Masinin adi "+new Car().carPrice("BMW, Sureti ise", 400));
		
		System.out.println("Masinin adi "+new Car().carPrice("BMW, Qiymeti ise", 200000));

	}

}

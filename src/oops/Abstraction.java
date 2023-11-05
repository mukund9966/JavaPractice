package oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW b1 = new BMW();
b1.start();
	}}

	class BMW extends Car{

		@Override
		void start() {
			System.out.println("BMW is there");// TODO Auto-generated method stub
			
		}
	}
	
	
	
	abstract class Car{
		int price;
		abstract void start();
	}


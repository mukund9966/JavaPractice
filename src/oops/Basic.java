package oops;

import encapsulation.Encapsulation;

public class Basic {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 12;
        p1.name = "mukund";
        
        Person p2  = new Person();
        p2.age= 13;
        p2.name = "nakul";
        
        System.out.println(p1.age+"  "+ p1.name);
        
        p1.run();
        p2.drink();
        
        p1.run(34);
        
        
        Person p3 = new Person(15, "naks");
        
        
        System.out.println(Person.count);
        
        
        Student s1 = new Student(19, "saransh");
        s1.drink();
        
        
        
//        Encapsulation e1  = new Encapsulation();
//        e1.doWork();
    }
}

class Student extends Person{
	public Student(int age, String name) {
		super(age, name);
	}
	
//	run time polymorphism
	void drink() {
		System.out.println(name +"is drinking while studying");
	}
}

class Person{
	String name;
	int age;
	static int count;
	
	public Person() {
		count++;
		System.out.println("object is created");
		
	}
	
	public Person(int age, String name) {
//		this();   //using so that Person contructor is also called here first 
		 this.name = name;
		 this.age = age;
	}
	
	void run() {
	
		System.out.println(name+" is running");
	}
	
	void drink() {
		System.out.println(name+" is drinking");
	}
	
//	polymorphism
	void run(int speed) {
		System.out.println(name+ " is running at speed  "+ speed);
	}
}

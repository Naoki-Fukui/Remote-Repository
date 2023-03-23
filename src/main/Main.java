package main;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 84);
		
//		System.out.println(person1.name);
//	    System.out.println(person1.age);
//	    System.out.println(person1.height);
		
	    person1.print();
	    
	    
	    
//	    Person person2 = new Person("山田花子", 22, 1.5, 55);
//	    person2.print();
	    
	    Person.printCount();
	    
	}

}

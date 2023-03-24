package main;

public class Main {

	public static void main(String[] args) {
		//	この値がコンストラクタに使用される（※引数の順番はコンストラクタ内に記載の順序と合わせる）
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 84);
		
		//	Person.javaのプリントメソッドを使用
	    person1.print();
	    
	    
	    
	    Person person2 = new Person("山田", "花子", 22, 1.5, 55);
	    person2.print();
	    
	    
	    Person.printCount();
	    
	}

}

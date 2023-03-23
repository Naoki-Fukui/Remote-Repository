package main;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	public static int count = 0;
	
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.count += 1;
	}
	
	
	public double bmi(){
		double BMI = weight / (height * height);
		return BMI;
	}
	
	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("BMIは" + Math.ceil(this.bmi()) + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	public static void printCount() {
		System.out.println("合計は" + count + "人です");
	}
}
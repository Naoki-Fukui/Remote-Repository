package main;

public class Person {
	// インスタンスフィールドを定義
	// アクセス修飾子でpublicをつけないと他のpackageから読み取れない
	public int age;
	public double height;
	public double weight;
	public static int count = 0;
	public String firstName;
	public String lastName;


	// コンストラクタを定義しインスタンスフィールドに値をセット
	// 引数に記載する順序はインスタンス生成時の初期値と合わせる必要あり
	Person(String firstName, String lastName, int age, double height, double weight){
		//	インスタンスフィールドに引数のageを代入。以下同じ
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count ++;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String fullName(){
		// インスタンスフィールドで定義したfirstNameとlastNameを繋げる処理
		return this.firstName + this.lastName;
	}


	public void print(){
		//	fullNameメソッドを実行したときに上の処理が行われ、firstName + lastNameの値が返ってくる
		//	今回の場合、Main.javaに格納されている鈴木太郎と山田花子
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	
	public double bmi(){
		//	lesson1.32で使用したBMIを求める式。
		//	値を代入するのではなく、変数として記載することで数値が変わっても対応可能
		double BMI = weight / (height * height);
		return BMI;
	}


	public static void printCount() {
		//	表示した人数をカウントするメソッド
		System.out.println("合計は" + count + "人です");
	}
}
package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
		String animalName;
	

	// Q2：フィールドに動物の数の変数を定義してください。
		int animalNum;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public static void main(String[] args) {
		Dog dName = new Dog();
		dName.animalName = "犬";
		System.out.println(dName.animalName);
	

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		Dog dNum = new Dog();
		dNum.animalNum = 3;
		System.out.println(dNum.animalNum);

	}
}

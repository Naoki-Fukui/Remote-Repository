package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		class Dog {
			String name = "dog";
			int nums = 7;


			public void nameOfAnimal() {
				System.out.println(name);
			}

			public void numOfAnimal() {
				System.out.println(nums);
			}
		}

		Dog a001 = new Dog();
		a001.name = "dog";
		System.out.println(a001.name);
		

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog a002 = new Dog();
		a002.nums = 7;
		System.out.println(a002.nums);

		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date date1 = new Date();

		SimpleDateFormat sdformat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fdate1 = sdformat1.format(date1);
		System.out.println(fdate1);
	}
}
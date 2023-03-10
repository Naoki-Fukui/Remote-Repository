/*
	問題．switch文を使用し、以下のプログラムを作成してください。
			変数に数値を代入
			
		①2の場合は、「（変数）月は28日です。」
			出力結果：2月は28日です。
			
		②4，6，9，11の場合は、「（変数）月は30日です。」
			出力例：4月は30日です。
			
		③その他の場合は、「（変数）月は31日です。」
			出力例：1月は31日です。
*/
package practice_switch.java;

import java.util.Random;

public class sample {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(12) + 1;
		switch(num) {
			case 2:
				System.out.println(num + "月は28日です。");
				break;
			case 4,6,9,11:
				System.out.println(num + "月は30日です。");
				break;
			case 1,3,5,7,8,10,12:
				System.out.println(num + "月は31日です。");
				break;
			default:
				System.out.println("エラー");
		}
	}    
}
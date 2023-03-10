package method;

import java.util.Random;

public class Method {

	public static void main(String[] args) {
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
		printHello("Hello Java");
		

		// Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
		System.out.println(num(6));
			
		
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		System.out.println(num2(300, 600));
		

		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		System.out.println( flo(1.45F, 1.70F));	
		

		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）
		//     を呼び出して、ループ文を用いてそれぞれの数をコンソールに出力してください。
		int[] array = new int[5];
		ran(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

		// Q6：Q5で作成した関数を用いて、配列の要素の平均値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		avg(array);
			
	}
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void printHello(String Say) {
		System.out.println(Say);
	}
	

	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	public static int num(int num) {
		return num++;
	}


	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	public static int num2(int num3, int num4) { 
		return num3 * num4;
	}	


	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	public static float flo(float num5, float num6) {
		return num5 * num6;
	}	
	
	
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	public static void ran(int[] array) {
		Random r = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(101);
		}
	}	


	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
	public static void avg(int[] array) {
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		if(array.length != 0) {
			System.out.println(sum / array.length);
		} else {
			System.out.println("配列がありません");
		}
	}
}
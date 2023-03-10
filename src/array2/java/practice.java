/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
package array2.java;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// String[] text1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		// int i = 0;

		// while(i < 10) {
		// 	System.out.println(text1[i]);
		// 	i++;
		// 	if(i > 3) {
		// 		break;
		// 	}
		// }

		String[] text2 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		int a = 0;

		while(a < 10) {
			if(a == 8) {
				a++;
				continue;
			}
			System.out.println(text2[a]);
			a++;
		}
		
	}

}
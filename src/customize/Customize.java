/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
 ※数値は毎回変わるように作ってください
 
	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */

package customize;

import java.util.Random;
import java.util.Scanner;





//乱数を生成するクラス
class randomParameters {
	
	
	
	Random rHp = new Random();
	Random rMp = new Random();
	Random rAt = new Random();
	Random rDe = new Random();
	Random rSp = new Random();
	int hp;
	int mp;
	int at;
	int de;
	int sp;
	
	
	public randomParameters(){
		hp = rHp.nextInt(100) + 900;
		mp = rMp.nextInt(100) + 900;
		at = rAt.nextInt(100) + 900;
		de = rDe.nextInt(100) + 900;
		sp = rSp.nextInt(100) + 900;
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		
		
		if(name != null) {
			System.out.println("こんにちは「" + name + "」さん");
			System.out.println("ステータス");
			System.out.println("HP：" + hp);
			System.out.println("MP：" + mp);
			System.out.println("攻撃力：" + at);
			System.out.println("素早さ：" + sp);
			System.out.println("防御力：" + de);
			System.out.println("さあ冒険に出かけよう！" );	
		}
	}
}



public class Customize extends randomParameters{
	public static void main(String[] args) {
		randomParameters rp = new randomParameters();
	}
	

}

/*

 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"

 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください

   	例:
   	8
   	5
   	9
   	と入力された場合（昇順）

   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2

   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2

 */


package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sort  {


	public void scan() {


		//		都道府県情報
		Map<Integer, String> map = new HashMap<>();
//		Map<Integer, String> mapList = new HashMap<>();

		int index = 0;

		map.put(index, "北海道:札幌市:83424"); //0
		map.put(++index, "青森県:青森市:9646"); //1
		map.put(++index, "岩手県:盛岡市:15275"); //2
		map.put(++index, "宮城県:仙台市:7282"); //3
		map.put(++index, "秋田県:秋田市:11638"); //4
		map.put(++index, "山形県:山形市:9323"); //5
		map.put(++index, "福島県:福島市:13784"); //6
		map.put(++index, "茨城県:水戸市:6097"); //7
		map.put(++index, "栃木県:宇都宮市:6408"); //8
		map.put(++index, "群馬県:前橋市:6362"); //9
		map.put(++index, "埼玉県:さいたま市:3798"); //10


		//		入力を促す文章を表示
		System.out.println("0～10を入力（複数指定する場合は半角スペースで区切ってください）");


		Scanner sc = new Scanner(System.in);


		//		入力された文字を読み取り、整数へ変換、配列へ代入
		String strInput = sc.nextLine();		//	入力される文字は文字列のため、Stringで読取
		String[] strSplit = strInput.split(","); //	strSplitへ空白文字で区切って代入
		int[] nums = new int[strSplit.length];	//	分割を行った数だけ整数の配列を作成

		for(int i = 0; i < strSplit.length; i++) {
			nums[i] = Integer.parseInt(strSplit[i]);  //	入力された数値分整数へ変換して配列へ代入
			System.out.println(strSplit[i]);
		}
		
		Arrays.sort(nums);


		//		入力を促す文章を表示
		System.out.println("昇順（1）または降順（2）を選んでください");
		int tmp = sc.nextInt();

		
		
		if(tmp==1)
		{
			for(int i = 0; i < strSplit.length; i++) {
					String[] split = map.get(nums[i]).split(":");
					String output = "都道府県名：" +split[0] + "\n";
				   	output += "県庁所在地：" + split[1] + "\n";
				   	output += "面積：" + Double.parseDouble(split[2]) +"km2"+ "\n";
				   	output += "数値：" + nums[i] + "\n";
					System.out.println(output);
			}
		}
		else if(tmp==2)
		{
			for(int i = strSplit.length-1; i >= 0; i--) {
				String[] split = map.get(nums[i]).split(":");
				String output = "都道府県名：" +split[0] + "\n";
			   	output += "県庁所在地：" + split[1] + "\n";
			   	output += "面積：" + Double.parseDouble(split[2]) +"km2"+ "\n";
			   	output += "数値：" + nums[i] + "\n";
				System.out.println(output);
			}
		}
		else
		{
			System.out.println("有効な入力ではありません");
		
		}
		

	}
}
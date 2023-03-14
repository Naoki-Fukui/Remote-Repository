
/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */

package object;


public class Object {
	
//	入力された値
	String name1 = "ライオン";
	float height1 = 2.1F;
	int speed1 = 80;
	String scientificName1 = "パンテラ レオ";
	
	
	String name2 = "ゾウ";
	float height2 = 3.2F;
	int speed2 = 40;
	String scientificName2 = "ロキソドンタ・サイクロティス";
	
	
	String name3 = "パンダ";
	float height3 = 1.9F;
	int speed3 = 30;
	String scientificName3 = "アイルロポダ・メラノレウカ";
	
	
	String name4 = "チンパンジー";
	float height4 = 0.94F;
	int speed4 = 25;
	String scientificName4 = "バン・トゥログロディテス";
	
	
	String name5 = "シマウマ";
	float height5 = 2.4F;
	int speed5 = 65;
	String scientificName5 = "チャップマンシマウマ";
	
	
	String name6 = "インコ";
	float height6 = 0.1F;
	int speed6 = 50;
	String scientificName6 = "不明";
	
}


class Print extends Object {
	public static void main(String[] args) {
		Object ob = new Object();
		if(ob.name1 != null) {
			System.out.println("動物名：" + ob.name1);
			System.out.println("体長：" + ob.height1 + "m");
			System.out.println("速度：" + ob.speed1 + "km/h");
			System.out.println("学名：" + ob.scientificName1);
			
			System.out.println("動物名：" + ob.name2);
			System.out.println("体長：" + ob.height2 + "m");
			System.out.println("速度：" + ob.speed2 + "km/h");
			System.out.println("学名：" + ob.scientificName2);
			
			System.out.println("動物名：" + ob.name3);
			System.out.println("体長：" + ob.height3 + "m");
			System.out.println("速度：" + ob.speed3 + "km/h");
			System.out.println("学名：" + ob.scientificName3);
			
			System.out.println("動物名：" + ob.name4);
			System.out.println("体長：" + ob.height4 + "m");
			System.out.println("速度：" + ob.speed4 + "km/h");
			System.out.println("学名：" + ob.scientificName4);
			
			System.out.println("動物名：" + ob.name5);
			System.out.println("体長：" + ob.height5 + "m");
			System.out.println("速度：" + ob.speed5 + "km/h");
			System.out.println("学名：" + ob.scientificName5);
			
			System.out.println("動物名：" + ob.name6);
			System.out.println("体長：" + ob.height6 + "m");
			System.out.println("速度：" + ob.speed6 + "km/h");
			System.out.println("学名：" + ob.scientificName6);
		}
	}
}

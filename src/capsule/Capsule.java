package capsule;

public class Capsule {
	
	private String animal = "ライオン";
	private float length;
	private int speed;
	
	
		
		/*
	 	
		下記がコンソールに出力されるように作成してください
		※thisとsetterとgetterとフィールドを使ってください
				 	
		動物名：ライオン
		体長：2.1m
		速度：80km/h
				 	
		 */

		public String getAnimal() {
			return this.animal;
		}
	
		public void setLength(float length) {
			this.length = 2.1F;
		}
		
		public void setSpeed(int speed) {
			this.speed = 80;
		}
		
		public static void main(String[] args) {
			Capsule c = new Capsule();
			System.out.println("動物名：" + c.animal);
			c.setLength(2.1F);
			System.out.println("体長：" + c.length + "m");
			c.setSpeed(80);
			System.out.println("速度：" + c.speed + "km/h");
		}
}

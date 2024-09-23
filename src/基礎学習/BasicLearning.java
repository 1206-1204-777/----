package 基礎学習;
import java.util.Random;//乱数(整数)をインポート
public class BasicLearning {
	public static void main(String[] args) {
		System.out.println("初めてのjava\n初めてのgithub");

		//switch文
        Random rand = new Random();
		int number = rand.nextInt(3)+1;//ランダム変数numberを作成 範囲１～３
            switch (number) {
                case 1 -> System.out.println(number*100+"点");//numberが１の場合の処理
                case 2 -> System.out.println(number*100+"点");//numberが2の処理
                default -> System.out.println("修正してください");
            }
        //if文
        int num = rand.nextInt(11,14);//乱数範囲11~13
        if(num<12){
            System.out.println("午前中");
        }else if(num==12){
            System.out.println("正午");
        }else if(num>12){
            System.out.println("午後");
        }
	}
}
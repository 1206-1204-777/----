package 基礎学習;

public class BasicLearning {
	public static void main(String[] args) {
		System.out.println("初めてのjava\n初めてのgithub");

		//if文
		int number = 1;//変数numberを作成
            switch (number) {
                case 1 -> System.out.println(number*100+"点");//numberが１の場合の処理
                case 2 -> System.out.println(number*100+"点");//numberが2の処理
                default -> System.out.println("修正してください");
            }
	}
}
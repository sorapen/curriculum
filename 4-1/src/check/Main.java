package check;

import constants.Constants;
public class Main{
	
	public static void main(String[] args) {
	
	//printNameメソッドに使用する変数と初期化に使用する文字を設定
	String firstName = "清水"; 
	String lastName = "飛鳥";
	
		//printName関数の呼び出しと出力
		System.out.println(printName(firstName, lastName));
		System.out.println();	
	
	//Petクラスのインスタンス化と表示(private static String printName～の前に記述しないと表示されない？)
	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		System.out.println();
		
	//RobotPetクラスのインスタンス化と表示(private static String printName～の前に記述しないと表示されない？)
	RobotPet r2d2 = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		r2d2.introduce();
		System.out.println();
	}
	
	//printName関数の定義
	private static String printName(String firstName, String lastName) {
		return firstName + lastName;
	}
	public static void print(String printName) {
		System.out.println(printName);
	
	
	}
}
